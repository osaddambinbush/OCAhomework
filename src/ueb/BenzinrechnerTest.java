package ueb;

import java.util.Scanner;

public class BenzinrechnerTest {

	public static void main(String[] args) {
		// Deklaration der Variablen
		double gefahreneKilometer;
		double verbrauchLiter;
		double verbrauch100;
		// Zuweisung der Werte durch Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie die gefahrenen Kilometer ein.");
		gefahreneKilometer = sc.nextDouble();
		System.out.println("Bitte geben Sie den Verbrauch in Liter ein.");
		verbrauchLiter = sc.nextDouble();
		// Berechnung der Verbrauchs auf 100 Kilometer
		verbrauch100 = verbrauchLiter * 100 / gefahreneKilometer; 
		// Formatierte Ausgabe des Ergebnisses
		System.out.printf("Ihr Verbrauch auf 100 Kilometer beträgt %.1f Liter.%n", verbrauch100);

	}

}
