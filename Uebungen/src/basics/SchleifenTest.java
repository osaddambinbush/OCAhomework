package basics;

public class SchleifenTest {

	public static void main(String[] args) {
		// Ausgabe der ersten 100 natürlichen Zahlen
		// for-Schleife (Zählschleife mit drei Teilen: Deklarationsteil;
		// Schleifenbedingung; Imkrementteil
		// Schleifenvariable i ist nur in der Schleife gültig (Blockvariable)
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		System.out.println("**************************************");
//		System.out.println("Wert von i nach der Schleife = " + i); // Compiler-Fehler: i ist Blockvariable
		int j;
		for (j = 1; j <= 100; j++) {
			System.out.println(j);
		}
		System.out.println("Wert von i nach der Schleife = " + j);
		System.out.println("**************************************");
//		Countdown von 10 bis 0
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println("**************************************");
//		Alle gerade natürlichen Zahlen bis 250 (2, 4, 6, ..., 250
		for (int i = 2; i <= 250; i += 2) { // i + = 2 steht für i = i + 2
			System.out.println(i);
		}
		System.out.println("**************************************");
//		Alle gerade natürlichen Zahlen bis 250 (2, 4, 6, ..., 250
		for (int i = 1; i <= 250; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("**************************************");
//		Alle Schaltjahr im Zeitraum 1900 inkl. bis 2100 inkl.
		for (int jahr = 1900; jahr <= 2100; jahr++) {
			if (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0) {
				System.out.println(jahr);
			}
		}
		
	}

}






