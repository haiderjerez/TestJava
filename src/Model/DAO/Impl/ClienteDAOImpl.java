package Model.DAO.Impl;


import Model.DAO.ClienteDAO;
import Model.Entities.Cliente;
import java.util.ArrayList;
import java.util.List;

public abstract class ClienteDAOImpl implements ClienteDAO {
    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public void insert(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void update(Cliente cliente) {
        int index = findIndexById(cliente.getId());
        if (index != -1) {
            clientes.set(index, cliente);
        }
    }

    @Override
    public void delete(Integer id) {
        int index = findIndexById(id);
        if (index != -1) {
            clientes.remove(index);
        }
    }

    @Override
    public Cliente findByID(Integer id) {
        return clientes.stream()
                .filter(c -> id != null && id.equals(c.getId()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Cliente> findAll() {
        return new ArrayList<>(clientes);
    }

    @Override
    public Cliente findByIdentificacion(String identificacion) {
        return clientes.stream()
                .filter(c -> identificacion != null && identificacion.equals(c.getIdentificacion()))
                .findFirst()
                .orElse(null);
    }


    @Override
    public List<Cliente> findByEstado(String estado) {
        List<Cliente> result = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getEstado().equals(estado)) {
                result.add(cliente);
            }
        }
        return result;
    }

    private int findIndexById(Integer id) {
        for (int i = 0; i < clientes.size(); i++) {
            if (id != null && id.equals(clientes.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }

}

