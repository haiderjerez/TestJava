package Model.DAO;

import Model.Entities.Cliente;

import java.util.List;

public interface ClienteDAO  extends GenericDAO<Cliente, Integer> {
    Cliente findByID(Integer id);

    Cliente findByIdentificacion(String identificacion);
    List<Cliente> findByEstado(String estado);
}
