package model;

import javax.xml.bind.annotation.XmlElement;

public class InternalTeacher extends Teacher {
	@XmlElement
	private static int SALARY_FIX = 200;

	public InternalTeacher() {
	}

	public InternalTeacher(int idTeacher, String lastNom, String firstName) {
		super(idTeacher, lastNom, firstName);
	}

	public static int getSALARYf() {
		return SALARY_FIX;
	}

	public static void setSALARYf(int sALARY) {
		SALARY_FIX = sALARY;
	}

	@Override
	public String toString() {
		return "Internal Teacher [idTeacher=" + getIdTeacher() + ", lastNom="
				+ getLastNom() + ", firstName=" + getFirstName() + ", salary: "
				+ getSALARYf() + "]";
	}

}
