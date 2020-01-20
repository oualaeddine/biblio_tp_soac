package soac.miniprojet.api;
// Generated 7 janv. 2020 11:56:55 by Hibernate Tools 5.4.7.Final

import soac.miniprojet.model.beans.ScholarYear;
import soac.miniprojet.model.beans.Students;
import soac.miniprojet.model.beans.StudentsBiblioInsc;
import soac.miniprojet.model.dao.DAO;
import soac.miniprojet.model.dao.DAOInterface;
import soac.miniprojet.model.dao.daos.StudentsBiblioInscDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 * StudentsBiblioInsc generated by hbm2java
 */
public class StudentsBiblioInscAPI  {

    StudentsBiblioInscDAO dao;


    public Object getById(int id) {

        return dao.getById(id);
    }


    public boolean deleteById(int id) {

        return dao.deleteById(id, "students_biblio_insc");
    }


    public boolean update(Object object) {

        return dao.update(object);
    }


    public boolean add(Object object) {

        return dao.add(object);
    }


    public LinkedList getAll() {


        return dao.getAll();
    }

    public int countAll() {

      return dao.countAll();
    }
}
