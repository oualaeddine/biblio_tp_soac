package soac.miniprojet.api;
// Generated 7 janv. 2020 11:56:55 by Hibernate Tools 5.4.7.Final

import soac.miniprojet.model.beans.InscriptionPeriod;
import soac.miniprojet.model.dao.DAO;
import soac.miniprojet.model.dao.DAOInterface;
import soac.miniprojet.model.dao.daos.InscriptionPeriodDAO;

import java.util.LinkedList;

/**
 * InscriptionPeriod generated by hbm2java
 */
public class InscriptionPeriodAPI  {

        InscriptionPeriodDAO periodDAO;


    public InscriptionPeriodAPI() {

        this.periodDAO = new InscriptionPeriodDAO();
    }


    public InscriptionPeriod getById(int id) {

        return (InscriptionPeriod) periodDAO.getById(id);
    }


    public boolean deleteById(int id) {

        return periodDAO.deleteById(id, "inscription_period");
    }


    public boolean update(Object object) {

        return periodDAO.update(object);

    }


    public boolean add(Object object) {

        return periodDAO.add(object);
    }


    public LinkedList getAll() {

        return periodDAO.getAll();
    }


    public int countAll() {
        return periodDAO.countAll();
    }
}
