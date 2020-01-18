package soac.miniprojet.daos;

import jdk.jshell.execution.Util;
import soac.miniprojet.daos.beans.Employees;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class EmployeesDAO extends DAO implements DAOInterface{
    @Override
    public Object getById(int id) {
        ResultSet result;
        try {
            result = statement.executeQuery("SELECT * FROM Employees WHERE id=" + id);
            if (result.next()) {
                Employees employe = new Employees();
                employe.setId(result.getInt("id"));
                employe.setNom(result.getString("nom"));
                employe.setPrenom(result.getString("prenom"));
                employe.setRole(result.getString("role"));

                return employe;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;    }

    @Override
    public boolean deleteById(int id) {
        return  deleteById(id,"Employees");
    }

    @Override
    public boolean update(Object object) {

        Employees employe = (Employees) object;
        try {
            statement.execute("UPDATE Employees SET " +
                    "nom = '" + employe.getNom() + "'," +
                    "prenom = '" + employe.getPrenom() + "'," +
                    "role = '" + employe.getRole() + "'," +

                    " WHERE Employees.id=" + employe.getId() + ";");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean add(Object object) {
        Employees employe = (Employees) object;
        try {
            statement.execute("INSERT INTO Employees (`nom`,`prenom`,`role` ) VALUES(" +
                    "'" + employe.getNom() + "'," +
                    "'" + employe.getPrenom() + "'," +
                    "'" + employe.getRole() + "'" + "," +
                    ");");
            return true;
    } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public LinkedList<Employees> getAll() {
        LinkedList<Employees> list = new LinkedList<>();
        ResultSet result;
        try {
            result = statement.executeQuery("SELECT * FROM Employees;");
            while (result.next()) {
                Employees employe = new Employees();
                employe.setId(result.getInt("id"));
                employe.setNom(result.getString("nom"));
                employe.setPrenom(result.getString("prenom"));
                employe.setRole(result.getString("role"));


                list.add(employe);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public int countAll() {
        ResultSet result;
        try {
            result = statement.executeQuery("SELECT count(id) FROM Employees;");
            if (result.next()) {
                return result.getInt("count(id)");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
