package TP1;

public class Principal {

	public static void main(String[] args) {
		
		String[] etudiant1 = {"a","b","c"};
		
		afficherCV(etudiant1);
		
	}
	
	private static void afficherCV(String[] etudiant1) {
		
		CV cv = new CV("La Boissière", "Antoine", "Étudiant", 1, etudiant1, "Rien")  ;
		
		cv.affiche(cv);
		
		//cv = new CV("La Boissière", "Antoine", "Étudiant", 1, "Sup", "Rien");
		
		cv.affiche(cv);
		
		//cv = new CV("La Boissière", "Antoine", "Étudiant", 1, "Sup", "Rien");
		
		cv.affiche(cv);
		
	}

}
