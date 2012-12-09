*---------------------------------------*
*	Auteur: Mohammed ATAILIA	*
*---------------------------------------*
*---------------------------------------*
*	Langage: Java (version 7u7)	*
*---------------------------------------*


-----------------------------------------------------------
* Informatika, une application pour la gestion des campus * 
-----------------------------------------------------------

* Le langage de programmation utilisé est: Java

* L’application répond aux spécifications du cahier des charges, PDF «Test2011-1 » ci-joint.

* Le fichier source contient 3 packages :

	1- Default package : contient la classe « Program » qui gère la création des objets et tester l’application.

	2- Model : contient les classes qui modélisent les différentes entités de l’application « Campus, Teacher, InternalTeacher, ExternalTeacher, et Student ».
	
	3- Exception : contient la classe « FullCampusException » pour la génération d’exception personnalisée.

------------------------------
Les fonctionnalités avancées :
------------------------------

	1- Tri des étudiants :
	----------------------
	une méthode « triListStudents() » de la classe « Campus », qui renvoie une liste de « Student » triée.

	2- Comparaisons entre étudiants :
	---------------------------------
 	une méthode « isTheSameAs(Student s) » de la classe « Student », qui renvoie un « boolean (true/false) » en fonction des cas suivant :

		> True si : Deux étudiants sans id avec le même nom et 	prénom.
		> False si : Deux étudiants sans id avec nom ou prénom différents.
		> True si : Deux étudiants avec deux id identiques.	
		> False si : Deux étudiants avec deux id différents.

	3- Comparaison entre campus :
	-----------------------------
	une méthode « isTheSameAs(Campus c) » de la classe « Campus », qui renvoie un « boolean (true/false) » en fonction des cas suivant :

		> True si : Deux campus dans la même ville et la même région.
		> False si : Deux campus dans deux villes ou régions différentes.


	4- La sauvegarde des données sous format Xml :
	----------------------------------------------
	La sauvegarde des données en format « Xml » est possible avec la méthode « saveToXml(String path, String fileName) » de la classe « Campus », qui prend en paramètres le chemin du dossier de stockage, plus le nom du fichier à stocker.

------------
Jeu de test:
------------

	la classe « Program » fourni t un jeu de test permettant de vérifier la création des objets et toutes les fonctionnalités de l’application.


