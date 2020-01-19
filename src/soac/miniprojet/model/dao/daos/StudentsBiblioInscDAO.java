package soac.miniprojet.model.dao.daos;
// Generated 7 janv. 2020 11:56:55 by Hibernate Tools 5.4.7.Final

import soac.miniprojet.model.beans.ScholarYear;
import soac.miniprojet.model.beans.Students;
import soac.miniprojet.model.beans.StudentsBiblioInsc;
import soac.miniprojet.model.dao.DAO;
import soac.miniprojet.model.dao.DAOInterface;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 * StudentsBiblioInsc generated by hbm2java
 */
public class StudentsBiblioInscDAO extends DAO implements DAOInterface {

    @Override
    public Object getById(int id) {

        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return deleteById(id, "students_biblio_insc");
    }

    @Override
    public boolean update(Object object) {
        return false;
    }

    @Override
    public boolean add(Object object) {
        StudentsBiblioInsc studentsBiblioInsc = (StudentsBiblioInsc) object;
        try {
            statement.execute("INSERT INTO students_biblio_insc (`student_id`,`scholar_year_id`,`date_insc` ) VALUES(" +
                    "'" + studentsBiblioInsc.getStudent().getId() + "'," +
                    "'" + studentsBiblioInsc.getScholarYear().getId() + "'," +
                    "'" + studentsBiblioInsc.getDateInsc() + "'" + "," +
                    ");");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public LinkedList getAll() {
        LinkedList<StudentsBiblioInsc> list = new LinkedList<>();
        ResultSet result;
        try {
            result = statement.executeQuery("SELECT * FROM students_biblio_insc;");
            while (result.next()) {
				StudentsBiblioInsc studentsBiblioInsc = new StudentsBiblioInsc();
				studentsBiblioInsc.setDateInsc(result.getDate("id"));
				studentsBiblioInsc.setScholarYear((ScholarYear) new ScholarYearDAO().getById(result.getInt("scholar_year_id")));
				studentsBiblioInsc.setStudent((Students) new StudentsDAO().getById(result.getInt("student_id")));
				list.add(studentsBiblioInsc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public int countAll() {
      return 0;
    }
}
