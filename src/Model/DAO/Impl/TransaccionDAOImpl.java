package Model.DAO.Impl;

import Model.DAO.TransaccionDAO;
import Model.Entities.Transaccion;
import java.util.ArrayList;
import java.util.List;

public abstract class TransaccionDAOImpl implements TransaccionDAO {
    private List<Transaccion> transacciones = new ArrayList<>();

    @Override
    public void insert(Transaccion transaccion) {
        transacciones.add(transaccion);
    }

    @Override
    public void update(Transaccion transaccion) {
        int index = findIndexById(transaccion.getId());
        if (index != -1) {
            transacciones.set(index, transaccion);
        }
    }

    @Override
    public void delete(Integer id) {
        int index = findIndexById(id);
        if (index != -1) {
            transacciones.remove(index);
        }
    }

    @Override
    public Transaccion findByID(Integer id) {
        return transacciones.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Transaccion> findAll() {
        return new ArrayList<>(transacciones);
    }

    @Override
    public List<Transaccion> findByCuentaId(int idCuenta) {
        List<Transaccion> result = new ArrayList<>();
        for (Transaccion transaccion : transacciones) {
            if (transaccion.getIdCuenta() == idCuenta) {
                result.add(transaccion);
            }
        }
        return result;
    }

    @Override
    public List<Transaccion> findByTipo(String tipo) {
        List<Transaccion> result = new ArrayList<>();
        for (Transaccion transaccion : transacciones) {
            if (transaccion.getTipo().equals(tipo)) {
                result.add(transaccion);
            }
        }
        return result;
    }

    @Override
    public List<Transaccion> findByFecha(String fecha) {
        List<Transaccion> result = new ArrayList<>();
        for (Transaccion transaccion : transacciones) {
            if (transaccion.getFecha().equals(fecha)) {
                result.add(transaccion);
            }
        }
        return result;
    }

    private int findIndexById(Integer id) {
        for (int i = 0; i < transacciones.size(); i++) {
            if (transacciones.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}

