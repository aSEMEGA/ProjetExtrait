SYSTEME DE GESTION D’EXTRAIT DE NAISSANCE
L’objectif de ce projet est de permettre l’insertion des données d’une personne
Puis de récupérer ces données pour générer automatiquement l’extrait de naissance de la personne et l’imprimer

Ce projet est composer dans 4 packages  comme suit : 
•	Classe :
Ici il y a extrait.java qui comporte la déclaration des attributs , initialisation du constructeur entre autre.
•	Dao :
Ici il y a connectdb.java qui est la connection à la base de donnée, 
Dao.java ici je déclare mes méthodes,
ExtraitDao.java ici je fais la définition de mes méthodes.
•	Form :
Cet package contient :
FrameExtrait.java dans cette partie on insert les données d’une personne dans la base de donnée.
AfficherExtrait.java ici on récupère les informations d’une personne et ça affiche les informations de la personne sur l’extrait et on imprime
