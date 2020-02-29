package ueb;

public class SchachproblemTest {

	public static void main(String[] args) {
		double anzahlReiskoerner = 1;
		double anzahlReiskoernerGesamt = 1;

		for (int i = 2; i <= 64; i++) {
			anzahlReiskoerner = anzahlReiskoerner * 2;
			anzahlReiskoernerGesamt += anzahlReiskoerner;
		}
		
		System.out.println("Anzahl Reiskörner = " + anzahlReiskoernerGesamt);
		
		double gesamtGewichtInGramm = anzahlReiskoernerGesamt * 0.25;
		
		System.out.println("Reisgewicht in Gramm = " + gesamtGewichtInGramm);
		
		double gesamtGewichtInTonnen = gesamtGewichtInGramm / 1_000_000;

		System.out.println("Reisgewicht in Tonnen = " + gesamtGewichtInTonnen);
		
		int jahresReisErnteInTonnen = 527_400_000;
		
		double anzahlJahre = gesamtGewichtInTonnen / jahresReisErnteInTonnen;
		
		System.out.println("Anzahl Jahre = " + anzahlJahre);
		
		
	}

}
