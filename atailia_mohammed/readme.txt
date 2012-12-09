			*---------------------------------------*
			*	Auteur: Mohammed ATAILIA	*
			*---------------------------------------*
			*---------------------------------------*
			*	Langage: Java (version 7u7)	*		
			*---------------------------------------*




--------------------------------------------------------
Informatika, une application pour la gestion des campus.
--------------------------------------------------------

* Le langage de programmation utilis� est: Java

* L�application r�pond aux sp�cifications du cahier des charges, PDF �Test2011-1 � ci-joint.

* Le fichier source contient 3 packages :

	1- Default package : contient la classe � Program � qui g�re la cr�ation des objets et tester l�application.

	2- Model : contient les classes qui mod�lisent les diff�rentes entit�s de l�application � Campus, Teacher, 					InternalTeacher, ExternalTeacher, et Student �.
	
	3- Exception : contient la classe � FullCampusException � pour la g�n�ration d�exception personnalis�e.

------------------------------
Les fonctionnalit�s avanc�es :
------------------------------

	1- Tri des �tudiants :
	----------------------
	une m�thode � triListStudents() � de la classe � Campus �, qui renvoie une liste de � Student � tri�e.

	2- Comparaisons entre �tudiants :
	---------------------------------
 	une m�thode � isTheSameAs(Student s) � de la classe � Student �, qui renvoie un � boolean (true/false) � en fonction des cas suivant :

			True si : Deux �tudiants sans id avec le m�me nom et pr�nom
			False si : Deux �tudiants sans id avec nom ou pr�nom diff�rents.
			True si : Deux �tudiants avec deux id identiques	
			False si : Deux �tudiants avec deux id diff�rents

	3- Comparaison entre campus :
	-----------------------------
	une m�thode � isTheSameAs(Campus c) � de la classe � Campus �, qui renvoie un � boolean (true/false) � en fonction des cas suivant :

			True si : Deux campus dans la m�me ville et la m�me r�gion
			False si : Deux campus dans deux villes ou r�gions diff�rentes


	4- La sauvegarde des donn�es sous format Xml :
	----------------------------------------------
	La sauvegarde des donn�es en format � Xml � est possible avec la m�thode � saveToXml(String path, String fileName) � de la classe � Campus �, qui prend en 		param�tres le chemin du dossier de stockage, plus le nom du fichier � stocker.

------------
Jeu de test:
------------

	la classe � Program � fourni t un jeu de test permettant de v�rifier la cr�ation des objets et toutes les fonctionnalit�s de l�application.


