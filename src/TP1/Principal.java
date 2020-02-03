package TP1;

public class Principal {

	public static void main(String[] args) {
		
		CV cv = new CV("La Boissière", "Antoine", "Étudiant", 1, "Sup", "Rien");
		
		cv.affiche(cv);
		
		cv = new CV("La Boissière", "Antoine", "Étudiant", 1, "Sup", "Rien");
		
		cv.affiche(cv);
		
		cv = new CV("La Boissière", "Antoine", "Étudiant", 1, "Sup", "Rien");
		
		cv.affiche(cv);
		
	}

}
