package Model.DAO.Impl;

import Model.DAO.CuentaDAO;
import Model.Entities.Cuenta;
import java.util.ArrayList;
import java.util.List;

public abstract class CuentaDAOImpl implements CuentaDAO {
    private List<Cuenta> cuentas = new ArrayList<>();

    @Override
    public void insert(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    @Override
    public void update(Cuenta cuenta) {
        int index = findIndexById(cuenta.getId());
        if (index != -1) {
            cuentas.set(index, cuenta);
        }
    }

    @Override
    public void delete(Integer id) {
        int index = findIndexById(id);
        if (index != -1) {
            cuentas.remove(index);
        }
    }

    @Override
    public Cuenta findByID(Integer id) {
        return cuentas.stream().filter(c -> c.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Cuenta> findAll() {
        return new ArrayList<>(cuentas);
    }

    @Override
    public List<Cuenta> findByClienteId(int idCliente) {
        List<Cuenta> result = new ArrayList<>();
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getIdCliente() == idCliente) {
                result.add(cuenta);
            }
        }
        return result;
    }

    @Override
    public List<Cuenta> findByTipo(String tipo) {
        List<Cuenta> result = new ArrayList<>();
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getTipo().equals(tipo)) {
                result.add(cuenta);
            }
        }
        return result;
    }

    @Override
    public Cuenta findByNumeroCuenta(String numeroCuenta) {
        return cuentas.stream().filter(c -> c.getIdCliente().equals(numeroCuenta)).findFirst().orElse(null);
    }

    private int findIndexById(Integer id) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
