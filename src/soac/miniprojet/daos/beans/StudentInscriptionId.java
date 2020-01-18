package soac.miniprojet.daos.beans;
// Generated 7 janv. 2020 11:56:55 by Hibernate Tools 5.4.7.Final

import java.util.Date;

/**
 * StudentInscriptionId generated by hbm2java
 */
public class StudentInscriptionId implements java.io.Serializable {

	private int studentId;
	private int inscPeriodId;
	private String level;
	private Date inscDate;

	public StudentInscriptionId() {
	}

	public StudentInscriptionId(int studentId, int inscPeriodId, String level, Date inscDate) {
		this.studentId = studentId;
		this.inscPeriodId = inscPeriodId;
		this.level = level;
		this.inscDate = inscDate;
	}

	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getInscPeriodId() {
		return this.inscPeriodId;
	}

	public void setInscPeriodId(int inscPeriodId) {
		this.inscPeriodId = inscPeriodId;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Date getInscDate() {
		return this.inscDate;
	}

	public void setInscDate(Date inscDate) {
		this.inscDate = inscDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StudentInscriptionId))
			return false;
		StudentInscriptionId castOther = (StudentInscriptionId) other;

		return (this.getStudentId() == castOther.getStudentId())
				&& (this.getInscPeriodId() == castOther.getInscPeriodId())
				&& ((this.getLevel() == castOther.getLevel()) || (this.getLevel() != null
						&& castOther.getLevel() != null && this.getLevel().equals(castOther.getLevel())))
				&& ((this.getInscDate() == castOther.getInscDate()) || (this.getInscDate() != null
						&& castOther.getInscDate() != null && this.getInscDate().equals(castOther.getInscDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getStudentId();
		result = 37 * result + this.getInscPeriodId();
		result = 37 * result + (getLevel() == null ? 0 : this.getLevel().hashCode());
		result = 37 * result + (getInscDate() == null ? 0 : this.getInscDate().hashCode());
		return result;
	}

}
