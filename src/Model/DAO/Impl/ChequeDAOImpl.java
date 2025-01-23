package Model.DAO.Impl;

import Model.Entities.Cheque;
import Model.DAO.ChequeDAO;
import java.util.ArrayList;
import java.util.List;

public abstract class ChequeDAOImpl implements ChequeDAO {

    private final List<Cheque> cheques = new ArrayList<>();

    @Override
    public void insert(Cheque entity) {
        cheques.add(entity);
    }

    @Override
    public void update(Cheque entity) {
        int index = findIndexById(entity.getId());
        if (index != -1) {
            cheques.set(index, entity);
        }
    }

    @Override
    public void delete(Integer id) {
        int index = findIndexById(id);
        if (index != -1) {
            cheques.remove(index);
        }
    }

    @Override
    public Cheque findByID(Integer id) {
        for (Cheque cheque : cheques) {
            if (cheque.getId() != null && cheque.getId() == id) {
                return cheque;
            }
        }
        return null;
    }

    @Override
    public List<Cheque> findAll() {
        return new ArrayList<>(cheques);
    }

    @Override
    public List<Cheque> findByCuentaId(int idCuenta) {
        List<Cheque> result = new ArrayList<>();
        for (Cheque cheque : cheques) {
            if (cheque.getIdCuenta() == idCuenta) {
                result.add(cheque);
            }
        }
        return result;
    }

    @Override
    public List<Cheque> findByEstado(String estado) {
        List<Cheque> result = new ArrayList<>();
        for (Cheque cheque : cheques) {
            if (cheque.getEstado() != null && cheque.getEstado() == estado) {
                result.add(cheque);
            }
        }
        return result;
    }

    @Override
    public List<Cheque> findByFechaEmision(String fechaEmision) {
        List<Cheque> result = new ArrayList<>();
        for (Cheque cheque : cheques) {
            if (cheque.getFechaEmision() != null && cheque.getFechaEmision() == fechaEmision) {
                result.add(cheque);
            }
        }
        return result;
    }

    private int findIndexById(Integer id) {
        for (int i = 0; i < cheques.size(); i++) {
            if (cheques.get(i).getId() != null && cheques.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
