package soac.miniprojet.model.dao.daos;
// Generated 7 janv. 2020 11:56:55 by Hibernate Tools 5.4.7.Final

import soac.miniprojet.model.beans.ScholarYear;
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
 * ScholarYear generated by hbm2java
 */
public class ScholarYearDAO extends DAO implements DAOInterface {


	@Override
	public Object getById(int id) {
		ResultSet result;
		try {
			result = statement.executeQuery("SELECT * FROM scholar_year WHERE id=" + id);
			if (result.next()) {
				ScholarYear scholarYear = new ScholarYear();
				scholarYear.setId(result.getInt("id"));
				scholarYear.setComments(result.getString("comments"));
				scholarYear.setStartDate(result.getDate("start_date"));
				scholarYear.setEndDate(result.getDate("end_date"));
				

				return scholarYear;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;    }

	@Override
	public boolean deleteById(int id) {
		return  deleteById(id,"scholar_year");
	}


	@Override
	public boolean add(Object object) {
		ScholarYear scholarYear = (ScholarYear) object;
		try {
			statement.execute("INSERT INTO scholar_year (`comments`,`start_date`,`end_date` ) VALUES(" +
					"'" + scholarYear.getComments() + "'," +
					"'" + scholarYear.getStartDate() + "'," +
					"'" + scholarYear.getEndDate() + "'" + "," +
					");");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public LinkedList<ScholarYear> getAll() {
		LinkedList<ScholarYear> list = new LinkedList<>();
		ResultSet result;
		try {
			result = statement.executeQuery("SELECT * FROM scholar_year;");
			while (result.next()) {
				ScholarYear scholarYear = new ScholarYear();
				scholarYear.setId(result.getInt("id"));
				scholarYear.setComments(result.getString("comments"));
				scholarYear.setStartDate(result.getDate("start_date"));
				scholarYear.setEndDate(result.getDate("end_date"));


				list.add(scholarYear);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public int countAll() {
		ResultSet result;
		try {
			result = statement.executeQuery("SELECT count(id) FROM scholar_year;");
			if (result.next()) {
				return result.getInt("count(id)");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}