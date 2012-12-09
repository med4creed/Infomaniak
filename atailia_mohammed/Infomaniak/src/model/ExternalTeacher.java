package model;

public class ExternalTeacher extends Teacher {

	private int salary;

	public ExternalTeacher() {
	}

	public ExternalTeacher(int idTeacher, String lastNom, String firstName,
			int salary) {
		super(idTeacher, lastNom, firstName);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Internal Teacher [idTeacher=" + getIdTeacher() + ", lastNom="
				+ getLastNom() + ", firstName=" + getFirstName() + ", salary: "
				+ getSalary() + "]";
	}

}
