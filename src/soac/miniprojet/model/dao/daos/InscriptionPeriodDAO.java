package soac.miniprojet.model.dao.daos;
// Generated 7 janv. 2020 11:56:55 by Hibernate Tools 5.4.7.Final

import soac.miniprojet.model.beans.BiblioInscPeriod;
import soac.miniprojet.model.beans.InscriptionPeriod;
import soac.miniprojet.model.beans.ScholarYear;
import soac.miniprojet.model.dao.DAO;
import soac.miniprojet.model.dao.DAOInterface;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * InscriptionPeriod generated by hbm2java
 */
public class InscriptionPeriodDAO extends DAO implements DAOInterface {

	@Override
	public Object getById(int id) {
		ResultSet result;
		try {
			result = statement.executeQuery("SELECT * FROM inscription_period WHERE id=" + id);
			if (result.next()) {
				InscriptionPeriod inscriptionPeriod = new InscriptionPeriod();
				inscriptionPeriod.setId(result.getInt("id"));
				inscriptionPeriod.setEndInscDate(result.getDate("end_insc_date"));
				inscriptionPeriod.setEndReinscDate(result.getDate("end_reinsc_date"));
				inscriptionPeriod.setStartInscDate(result.getDate("start_insc_date"));
				inscriptionPeriod.setStartReinscDate(result.getDate("start_reinsc_date"));
				inscriptionPeriod.setScholarYear((ScholarYear) new ScholarYearDAO().getById(result.getInt("scholat_year")));

				return inscriptionPeriod;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;    }

	@Override
	public boolean deleteById(int id) {
		return  deleteById(id,"inscription_period");
	}

	@Override
	public boolean update(Object object) {

		InscriptionPeriod inscriptionPeriod = (InscriptionPeriod) object;
		try {
			statement.execute("UPDATE inscription_period SET " +
					"end_insc_date = '" + inscriptionPeriod.getEndInscDate() + "'," +
					"end_reinsc_date = '" + inscriptionPeriod.getEndReinscDate() + "'," +
					"start_insc_date = '" + inscriptionPeriod.getStartInscDate() + "'," +
					"start_reinsc_date = '" + inscriptionPeriod.getStartReinscDate() + "'," +
					"scholar_year = '" + inscriptionPeriod.getScholarYear() + "'," +

					" WHERE inscription_period.id=" + inscriptionPeriod.getId() + ";");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean add(Object object) {
		InscriptionPeriod inscriptionPeriod = (InscriptionPeriod) object;
		try {
			statement.execute("INSERT INTO inscription_period (`start_insc_date`,`start_reinsc_date`,`end_insc_date`,`end_reinsc_date`,`scholar_year` ) VALUES(" +
					"'" + inscriptionPeriod.getStartInscDate() + "'," +
					"'" + inscriptionPeriod.getStartReinscDate() + "'," +
					"'" + inscriptionPeriod.getEndInscDate() + "'," +
					"'" + inscriptionPeriod.getEndReinscDate() + "'," +
					"'" + inscriptionPeriod.getScholarYear() + "'" + "," +
					");");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public LinkedList<BiblioInscPeriod> getAll() {
		LinkedList<BiblioInscPeriod> list = new LinkedList<>();
		ResultSet result;
		try {
			result = statement.executeQuery("SELECT * FROM biblio_insc_period;");
			while (result.next()) {
				BiblioInscPeriod biblioInscPeriod = new BiblioInscPeriod();
				biblioInscPeriod.setId(result.getInt("id"));
				biblioInscPeriod.setDateStart(result.getDate("nom"));
				biblioInscPeriod.setDateEnd(result.getDate("prenom"));
				biblioInscPeriod.setScholarYear((ScholarYear) new ScholarYearDAO().getById(result.getInt("scholat_year_id") ));


				list.add(biblioInscPeriod);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public int countAll() {
		ResultSet result;
		try {
			result = statement.executeQuery("SELECT count(id) FROM biblio_insc_period;");
			if (result.next()) {
				return result.getInt("count(id)");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
