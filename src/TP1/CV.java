package TP1;

public class CV {
	
	String nom;
	String prenom;
	String formation;
	int experiencesTravail;
	String[] competences = new String[3];
	String attentes;
	
	public CV() {
		
	}
	
	public CV(String nom, String prenom, String formation, int experiancesTravail, String[] competences, String attentes) {
		
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
						   "Expériances de travail : " + cv.experiencesTravail);
		
		for (int i = 0; i < cv.competences.length; i++) {
			System.out.println("Compétence " + (i + 1) + " : " + cv.competences[i]);
		}
		
		System.out.println("Attentes : " + cv.attentes + "\n");
		
		
						   
		
	}
	
}
