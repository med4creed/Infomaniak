import java.io.IOException;

import model.Campus;
import model.ExternalTeacher;
import model.InternalTeacher;
import model.Student;
import model.Teacher;

public class Program {

	public static void main(String[] args) throws IOException {

		// Création d'objet de type Campus
		// avec c1 et c2 dans la meme ville la meme region
		Campus c1 = new Campus("Montpellier", "Languedoc-Roussillon", 10);
		Campus c2 = new Campus("Montpellier", "Languedoc-Roussillon", 5);
		Campus c3 = new Campus("Paris", "Ile-de-France", 6);

		// Création d'objet de type Etudiant sans id => "id == 0"
		Student s1 = new Student(0, "toto", "lolo");
		Student s2 = new Student(0, "toto", "lolo");

		Student s3 = new Student(0, "jojo", "lolo");
		Student s4 = new Student(0, "toto", "koko");

		// Création d'objet de type Etudiant avec id => "id != 0"
		Student s5 = new Student(1, "toto", "lolo");
		Student s6 = new Student(1, "kiki", "sisi");
		Student s7 = new Student(3, "toto", "lolo");
		Student s8 = new Student(4, "kaka", "lala");
		Student s9 = new Student(5, "jaja", "momo");
		Student s10 = new Student(6, "sisi", "riri");

		// Création d'objet de type professeur interne
		Teacher t1 = new InternalTeacher(1, "nomProf1", "pnomProf1");
		Teacher t2 = new InternalTeacher(2, "nomProf2", "pnomProf2");
		Teacher t3 = new InternalTeacher(3, "nomProf3", "pnomProf3");
		// Création d'objet de type professeur externe
		Teacher t4 = new ExternalTeacher(4, "nomProf4", "pnomProf4", 3000);
		Teacher t5 = new ExternalTeacher(5, "nomProf5", "pnomProf5", 2000);
		Teacher t6 = new ExternalTeacher(6, "nomProf6", "pnomProf6", 1000);

		// Ajouter des étudiants de façon aléatoire
		c1.addStudent(s10);
		c1.addStudent(s7);
		c1.addStudent(s3);
		c1.addStudent(s2);
		c1.addStudent(s8);
		c1.addStudent(s1);
		c1.addStudent(s6);
		c1.addStudent(s4);
		c1.addStudent(s5);
		c1.addStudent(s9);

		// Ajouter des professeur
		c1.addTeacher(t1);
		c1.addTeacher(t2);
		c1.addTeacher(t3);
		c1.addTeacher(t4);
		c1.addTeacher(t5);
		c1.addTeacher(t6);

		// Les tests
		System.out
				.println("---------------------- LES TESTS ----------------------");

		// test d'objet
		System.out
				.println("-------------- tests d'objets Campus-------------------");
		System.out.println(c1);
		System.out.println(c3);
		System.out
				.println("-------------- tests d'objets Etudiant-----------------");
		System.out.println(s1);
		System.out.println(s6);
		System.out
				.println("-------------- tests d'objets professeur---------------");
		System.out.println(t1);
		System.out.println(t4);

		// test de la capacité d'un campus
		System.out
				.println("----------------- tester la capacité d'un campus --------------------\n"
						+ "------ campus de paris a une capacité de 6 étudiant max -------------\n"
						+ "----- ajouter plus de 6 étudiants génère une exception---------------");
		c2.addStudent(s1);
		c2.addStudent(s2);
		c2.addStudent(s3);
		c2.addStudent(s4);
		c2.addStudent(s5);
		c2.addStudent(s6);

		// test des lists
		System.out
				.println("-------------- tester la liste des étudinat-------------");
		System.out.println("Est ce que la liste est vide? réponse: "
				+ c1.getStudents().isEmpty());
		System.out
				.println("Le 1er de la liste est: " + c1.getStudents().get(0));
		System.out
				.println("-------------- tester la liste des professeurs-------------");
		System.out.println("Est ce que la liste est vide? réponse: "
				+ c1.getTeachers().isEmpty());
		System.out.println("Le 1er de la list est: " + c1.getTeachers().get(0));

		// test de tri
		System.out.println("-------------- test de tri de liste-------------");
		System.out.println("-------------- avant le tri --------------------");
		for (Student s : c1.getStudents())
			System.out.println(s);
		System.out.println("-------------- après le tri --------------------");
		c1.triListStudents();
		for (Student s : c1.getStudents())
			System.out.println(s);

		// tests de comparaisons entre étudiants
		System.out
				.println("-------------- tests de comparaisons entre étudiants-------------");
		System.out
				.println("---- Deux étudiants sans id (id=0) mais avec le meme nom mais pas le meme prénom (s1,s2)-----");
		System.out.println("Est ce que s1 est s2? réponse: "
				+ s1.isTheSameAs(s2));
		System.out
				.println("---- Deux étudiants sans id mais avec le meme nom mais pas le meme prénom (s1,s3)-------");
		System.out.println("Est ce que s1 est s3? réponse: "
				+ s1.isTheSameAs(s3));
		System.out
				.println("---- Deux étudiants sans id mais avec le meme prénom mais pas le meme nom (s1,s4)-------");
		System.out.println("Est ce que s1 est s4? réponse: "
				+ s1.isTheSameAs(s4));
		System.out
				.println("---- Deux étudiants avec deux id identiques, (s5,s6) ---------------------------------");
		System.out.println("Est ce que s5 est s6? réponse: "
				+ s5.isTheSameAs(s6));
		System.out
				.println("---- Deux étudiants avec deux id différents (s5,s7) avec le meme nom et prénom --------");
		System.out.println("Est ce que s5 est s7? réponse: "
				+ s5.isTheSameAs(s7));
		System.out
				.println("---- Deux étudiants avec deux id différents (s7,s8) avec nom et prénom différents -----");
		System.out.println("Est ce que s7 est s8? réponse: "
				+ s7.isTheSameAs(s8));
		System.out
				.println("---- Deux étudiants, l'un avec id et l'autre sans id (s1,s8) --------------------------");
		System.out.println("Est ce que s1 est s8? réponse: "
				+ s1.isTheSameAs(s8));

		// tests de comparaisons entre Campus
		System.out
				.println("-------------- tests de comparaisons entre campus-------------");
		System.out
				.println("---- Deux campus dans la meme ville et la meme region (c1,c2)-----");
		System.out.println("Est ce que c1 est c2? réponse: "
				+ c1.isTheSameAs(c2));
		System.out
				.println("---- Deux campus dans deux villes ou regions différentes (c1,c3)-----");
		System.out.println("Est ce que c1 est c3? réponse: "
				+ c1.isTheSameAs(c3));

		// Sauvgarde des données dans un fichier out.xml
		c1.saveToXml("C:\\Users\\PC\\workspace\\informatika\\out",
				"campusDeMontpellier.xml");
		c3.saveToXml("C:\\Users\\PC\\workspace\\informatika\\out",
				"campusDeParis.xml");
		System.out.println("----------------------------------------------------------------------------\n" +
							"---------------------------- by Mohammed Atailia ---------------------------\n" +
							"----------------------------------------------------------------------------\n" +
							"---------------------------------- MERCI -----------------------------------");
		
	}

}
