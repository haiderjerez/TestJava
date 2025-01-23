package Model.DAO;

import Model.Entities.Transaccion;

import java.util.List;

public interface TransaccionDAO extends GenericDAO<Transaccion, Integer>{
    Transaccion findByID(Integer id);

    List<Transaccion> findByCuentaId(int idCuenta);
    List<Transaccion> findByTipo(String tipo);
    List<Transaccion> findByFecha(String fecha);
}
