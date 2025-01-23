package Model.DAO;

import java.util.List;

public interface GenericDAO<T, ID> {
    void insert(T entity);
    void update(T entity);
    void delete(ID id);
    T findById(ID id);
    List<T> findAll();

}
