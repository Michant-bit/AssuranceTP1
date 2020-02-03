package TP1;

public class CV {
	
	String nom;
	String prenom;
	String formation;
	int experiencesTravail;
	String competences;
	String attentes;
	
	public CV() {
		
	}
	
	public CV(String nom, String prenom, String formation, int experiancesTravail, String competences, String attentes) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.formation = formation;
		this.experiencesTravail = experiancesTravail;
		this.competences = competences;
		this.attentes = attentes;
		
	}
	
	public void affiche(CV cv) {
		
		System.out.println("Nom : " + cv.nom + "\n" +
						   "Prenom : " + cv.prenom + "\n" +
						   "Formation : " + cv.formation + "\n" +
						   "Expériances de travail : " + cv.experiencesTravail + "\n" +
						   "Compétences : " + cv.competences + "\n" +
						   "Attentes : " + cv.attentes);
		
	}
	
}
