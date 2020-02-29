package ueb;

import java.util.Scanner;

public class SparzinsrechnerTest {

	public static void main(String[] args) {
		// Deklaration der Variablen
		double startkapital, zinssatz, endkapital;
		int laufzeit;
		// Zuweisung der Werte durch den Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihr Startkapital ein.");
		startkapital = sc.nextDouble();
		System.out.println("Bitte geben Sie den Zinssatz ein.");
		zinssatz = sc.nextDouble();
		System.out.println("Bitte geben Sie die Laufzeit ein.");
		laufzeit = sc.nextInt();
		// Berechnung des Endkapitals
		endkapital = startkapital * Math.pow(1 + zinssatz / 100, laufzeit);
		// Formatierte Ausgabe des Endkapitals
		System.out.printf("Ihr Endkapital bei einem Startkapital von %.2f € nach %d Jahren und einem Zinssatz von %.1f Prozent beträgt %.2f €"
				, startkapital, laufzeit, zinssatz, endkapital);
	}

}
