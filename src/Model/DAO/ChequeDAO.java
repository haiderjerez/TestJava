package Model.DAO;

import Model.Entities.Cheque;

import java.util.List;

public interface ChequeDAO extends GenericDAO<Cheque, Integer>{
    Cheque findByID(Integer id);

    List<Cheque> findByCuentaId(int idCuenta);
    List<Cheque> findByEstado(String estado);
    List<Cheque> findByFechaEmision(String fechaEmision);
}
