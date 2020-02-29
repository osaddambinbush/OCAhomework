package basics;

import java.util.Scanner;

public class SchleifenTestZwei {

	public static void main(String[] args) {
		// Benutzer soll Zahlen eingeben. Diese werden aufaddiert. Gibt der Benutzer
		// eine 0 ein, wird abgebrochen und die Summe angezeigt.
		Scanner sc = new Scanner(System.in);
		int zahl;
		int summe = 0;
		// Schleife wird ausgeführt, solange die Bedingung true ergibt
		// Fußgesteuerte Schleife, Bedingung im Schleifenfuß
//		do {
//			System.out.println("Bitte geben Sie eine Zahl ein. 0 für Ende.");
//			zahl = sc.nextInt();
//			if (zahl < 0) {
//				System.err.println("Bitte positive Werte eingeben!");
////				Aktuellen Schleifendurchlauf abbrechen, mit dem nächsten Durchlauf beginnen
//				continue;
//			}
////			summe = summe + zahl;
//			summe += zahl;
//		} while (zahl != 0);
		
//		Variante mit kopfgesteuerter Schleife
		while (true) {
			System.out.println("Bitte geben Sie eine Zahl ein. 0 für Ende.");
			zahl = sc.nextInt();
			if (zahl < 0) {
				System.err.println("Bitte positive Werte eingeben!");
				continue;
			}
			if (zahl == 0) {
				break; // Schleife wird abgebrochen
			}
			summe += zahl;
		}

		// Schleife wird ausgeführt, solange die Bedingung true ergibt
		// Kopfgesteuerte Schleife, Bedingung im Schleifenkopf
//		while (zahl != 0) { 
//			System.out.println("SCHLEIFE: Bitte geben Sie eine Zahl ein. 0 für Ende.");
//			zahl = sc.nextInt();
//		}
		System.out.println("Die Summe der eingegebenen Zahlen lautet " + summe);
		System.out.println("Servus");
	}

}
