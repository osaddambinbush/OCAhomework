package ueb;

public class NotenTest {
	
	public static void main(String[] args) {
		double punkte = 45;
		double note;
//		System.out.println("Ihre Note ist " + note); // Compiler-Fehler: nicht initialisiert
//		Note Punkte 5,0 0 - 49,5 4,7 50 - 59,5 4,0 60 - 64,5 3,7 65 - 69,5 3,3 70 - 74,5 3,0 75 - 79,5 2,7 80 - 84,5 2,3 85 - 89,5 
//		2,0 90 - 94,5 1,7 95 - 99,5 1,3 100 - 104,5 1,0 105 - 120
		if (punkte >= 105 && punkte <= 120) {
			note = 1;
		} else if (punkte >= 100) {
			note = 1.3;
		} else if (punkte >= 95) {
			note = 1.7;
		} else if (punkte >= 90) {
			note = 2;
		} else if (punkte >= 85) {
			note = 2.3;
		} else if (punkte >= 80) {
			note = 2.7;
		} else if (punkte >= 75) {
			note = 3;
		} else if (punkte >= 70) {
			note = 3.3;
		} else if (punkte >= 65) {
			note = 3.7;
		} else if (punkte >= 60) {
			note = 4;
		} else if (punkte >= 50) {
			note = 4.7;
		} else {
			note = 5;
		}
		
		System.out.println("Ihre Note ist " + note);
		
	}

}
