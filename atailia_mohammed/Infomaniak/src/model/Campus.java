package model;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import exception.FullCampusException;

@XmlRootElement
@XmlType(propOrder = { "ville", "region", "capacite", "students", "teachers" })
public class Campus implements Comparable<Object> {

	private String ville;
	private String region;
	private int capacite;
	@XmlElementWrapper(name = "Students")
	@XmlElement(name = "Student", type = Student.class)
	private List<Student> students = new ArrayList<>();
	@XmlElementWrapper(name = "Teachers")
	@XmlElements({
			@XmlElement(name = "InternalTeacher", type = InternalTeacher.class),
			@XmlElement(name = "ExternalTeacher", type = ExternalTeacher.class), })
	private List<Teacher> teachers = new ArrayList<>();

	public Campus() {
	}

	public Campus(String ville, String region, int capacite) {
		this.ville = ville;
		this.region = region;
		this.capacite = capacite;
	}

	public Campus(String ville, String region, int capacite,
			List<Student> students, List<Teacher> teachers) {
		this.ville = ville;
		this.region = region;
		this.capacite = capacite;
		this.students = students;
		this.teachers = teachers;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	@XmlTransient
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@XmlTransient
	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	@Override
	public String toString() {
		return "Campus [ville=" + ville + ", region=" + region + ", capacite="
				+ capacite + ", students=" + students + ", teachers="
				+ teachers + "]";
	}

	// Méthodes spécifiques pur gérer les étudiants

	public void addStudent(Student s) {
		try {
			if (getStudents() == null) {
				getStudents().add(s);
			} else {

				if (students.size() < getCapacite()) {
					getStudents().add(s);
				} else {
					throw new FullCampusException("le campus est plein!!!");
				}
			}

		} catch (FullCampusException e) {
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}

	}

	public void removeStudent(Student s) {
		getStudents().remove(s);
	}

	// Méthodes spécifiques pur gérer les professeurs

	public void addTeacher(Teacher t) {
		getTeachers().add(t);
	}

	public void removeTeacher(Teacher t) {
		getTeachers().remove(t);
	}

	// Tri de la list des étudiants
	public List<Student> triListStudents() {
		Collections.sort(this.getStudents());
		return this.getStudents();
	}

	// Comparaison entre deux campus
	public boolean isTheSameAs(Campus c) {
		if (this.compareTo(c) == 0)
			return true;
		else
			return false;
	}

	@Override
	public int compareTo(Object o) {
		Campus c = (Campus) o;
		if (this.getVille().compareToIgnoreCase(c.getVille()) == 0
				&& this.getRegion().compareToIgnoreCase(c.getRegion()) == 0) {
			return 0;

		} else {
			return 1;
		}

	}
	
	// Sauvgarde de donnée en format Xml
	public void saveToXml(String path, String fileName) {
		try {
			File file = new File(path + "\\" + fileName);
			
			JAXBContext jaxbContext = JAXBContext.newInstance(Campus.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(this, file);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
