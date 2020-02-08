package TP1;

public class Principal {

	public static void main(String[] args) {
		
		String[] etudiant1 = {"Java","c#","HTML"};
		String[] etudiant2 = {"Java","c#","HTML"};
		String[] etudiant3 = {"Java","c#","HTML"};
		
		afficherCV(etudiant1, etudiant2, etudiant3);
		
	}
	
	private static void afficherCV(String[] etudiant1, String[] etudiant2, String[] etudiant3) {
		
		System.out.println("Bienvenue  chez  Barette!\n" );
		
		CV cv = new CV("La Boissière", "Antoine", "Étudiant", 2, etudiant1, "Aucun")  ;
		
		cv.affiche(cv);
		
		cv = new CV("Linh", "Kenny", "Étudiant", 2, etudiant2, "Aucun");
		
		cv.affiche(cv);
		
		cv = new CV("Arab", "Frédéric", "Étudiant", 2, etudiant3, "J'ai hâte d'apprendre avec vous");
		
		cv.affiche(cv);
		
	}

}
