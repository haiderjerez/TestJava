package Model.DAO;

import Model.Entities.Cuenta;

import java.util.List;

public interface CuentaDAO extends GenericDAO<Cuenta, Integer>{
    Cuenta findByID(Integer id);

    List<Cuenta> findByClienteId(int idCliente);
    List<Cuenta> findByTipo(String tipo);
    Cuenta findByNumeroCuenta(String numeroCuenta);
}
