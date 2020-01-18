package soac.miniprojet.daos;

import java.util.LinkedList;

public class EmployeesDAO extends DAO implements DAOInterface{
    @Override
    public Object getById(int id) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return  deleteById(id,"users");
    }

    @Override
    public boolean update(Object object) {

        return false;
    }

    @Override
    public boolean add(Object object) {
        return false;
    }

    @Override
    public boolean delete(Object object) {
        return false;
    }

    @Override
    public LinkedList getAll() {
        return null;
    }

    @Override
    public int countAll() {
        return 0;
    }
}
