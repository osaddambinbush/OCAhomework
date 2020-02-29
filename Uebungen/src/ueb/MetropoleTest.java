package ueb;

public class MetropoleTest {

	public static void main(String[] args) {
//		Deklaration der Variablen
		String stadt = "Dresden";
		boolean istHauptstadt = false;
		int anzahlEinwohner = 585_000;
		double steuernProEinwohner = 1500;
		boolean istMetropole;
		
//		Wir definieren eine Metropole als eine Stadt, die Hauptstadt ist mit mehr als 100 000 Einwohner oder die mehr als 200 000 Einwohner hat 
//		und im Durchschnitt mindestens 720 000 000 Steuereinnahmen hat.  
//		if (istHauptstadt == true && anzahlEinwohner >= 100_000) {
//			istMetropole = true;
//		} else if (anzahlEinwohner >= 200_000 && steuernProEinwohner * anzahlEinwohner >= 720_000_000) {
//			istMetropole = true;
//		} else {
//			istMetropole = false;
//		}
		
//		if (istHauptstadt == true && anzahlEinwohner >= 100_000 || anzahlEinwohner >= 200_000 && steuernProEinwohner * anzahlEinwohner >= 720_000_000) {
//			istMetropole = true;
//		} else {
//			istMetropole = false;
//		}
		
		istMetropole = istHauptstadt == true && anzahlEinwohner >= 100_000 || anzahlEinwohner >= 200_000 && steuernProEinwohner * anzahlEinwohner >= 720_000_000;
				
//		!istMetropole bedeutet: NICHT oder NOT istMetropople, der Wahrheitswert wird umgekehrt
		System.out.println("Die Stadt " + stadt + " ist " + (!istMetropole ? "k" : "") + "eine Metropole.");

	}

}
