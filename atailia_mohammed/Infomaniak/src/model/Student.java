package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

public class Student implements Comparable {

	@XmlAttribute
	private int idStudent;
	private String lastNom;
	private String firstName;

	public Student() {
	}

	public Student(int idStudent, String lastNom, String firstName) {
		this.idStudent = idStudent;
		this.lastNom = lastNom;
		this.firstName = firstName;
	}

	@XmlTransient
	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
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
		return "Student [idStudent=" + idStudent + ", lastNom=" + lastNom
				+ ", firstName=" + firstName + "]";
	}

	// Comparaison entre deux étudiants

	public boolean isTheSameAs(Student s) {
		if (this.compareTo(s) == 0)
			return true;
		else
			return false;
	}

	@Override
	public int compareTo(Object o) {
		if (this.getIdStudent() != 0) {
			if (((Student) o).getIdStudent() > this.getIdStudent())
				return -1;
			else if (((Student) o).getIdStudent() == this.getIdStudent())
				return 0;
			else
				return 1;
		} else {
			if (((Student) o).getIdStudent() != 0) {
				return -1;
			} else {
				if (this.getLastNom().compareToIgnoreCase(
						((Student) o).getLastNom()) == 0) {
					return this.getFirstName().compareToIgnoreCase(
							((Student) o).getFirstName());
				} else {
					return this.getLastNom().compareToIgnoreCase(
							((Student) o).getLastNom());
				}
			}
		}
	}

}
