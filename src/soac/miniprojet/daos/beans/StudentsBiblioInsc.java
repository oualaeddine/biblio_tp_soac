package soac.miniprojet.daos.beans;
// Generated 7 janv. 2020 11:56:55 by Hibernate Tools 5.4.7.Final

/**
 * StudentsBiblioInsc generated by hbm2java
 */
public class StudentsBiblioInsc implements java.io.Serializable {

	private StudentsBiblioInscId id;
	private ScholarYear scholarYear;
	private Students students;

	public StudentsBiblioInsc() {
	}

	public StudentsBiblioInsc(StudentsBiblioInscId id, ScholarYear scholarYear, Students students) {
		this.id = id;
		this.scholarYear = scholarYear;
		this.students = students;
	}

	public StudentsBiblioInscId getId() {
		return this.id;
	}

	public void setId(StudentsBiblioInscId id) {
		this.id = id;
	}

	public ScholarYear getScholarYear() {
		return this.scholarYear;
	}

	public void setScholarYear(ScholarYear scholarYear) {
		this.scholarYear = scholarYear;
	}

	public Students getStudents() {
		return this.students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

}
