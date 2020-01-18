package soac.miniprojet.daos.beans;
// Generated 7 janv. 2020 11:56:55 by Hibernate Tools 5.4.7.Final

import java.util.Date;

/**
 * BiblioInscPeriod generated by hbm2java
 */
public class BiblioInscPeriod implements java.io.Serializable {

	private Integer id;
	private ScholarYear scholarYear;
	private Date dateStart;
	private Date dateEnd;

	public BiblioInscPeriod() {
	}

	public BiblioInscPeriod(ScholarYear scholarYear, Date dateStart, Date dateEnd) {
		this.scholarYear = scholarYear;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ScholarYear getScholarYear() {
		return this.scholarYear;
	}

	public void setScholarYear(ScholarYear scholarYear) {
		this.scholarYear = scholarYear;
	}

	public Date getDateStart() {
		return this.dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getDateEnd() {
		return this.dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

}