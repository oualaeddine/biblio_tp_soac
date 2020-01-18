package soac.miniprojet.daos;

import java.util.LinkedList;

public interface DAOInterface {

    Object getById(int id);

    boolean deleteById(int id);

    boolean update(Object object);

    boolean add(Object object);

    boolean delete(Object object);

    LinkedList getAll();

    public abstract int countAll();
}