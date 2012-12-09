package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

public abstract class Teacher {
	@XmlAttribute
	private int idTeacher;
	private String lastNom;
	private String firstName;

	public Teacher() {
	}

	public Teacher(int idTeacher, String lastNom, String firstName) {
		this.idTeacher = idTeacher;
		this.lastNom = lastNom;
		this.firstName = firstName;
	}

	@XmlTransient
	public int getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}

	public String getLastNom() {
		return lastNom;
	}

	public void setLastNom(String lastNom) {
		this.lastNom = lastNom;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Teacher [idTeacher=" + idTeacher + ", lastNom=" + lastNom
				+ ", firstName=" + firstName + "]";
	}

}
