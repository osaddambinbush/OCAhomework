package ueb;

import java.util.Scanner;

public class BruttoNettoRechner {

	public static void main(String[] args) {
		// Der Benutzer soll einen Bruttopreis eingeben können (Kommazahl)
		// Ausgegeben wird der Nettopreis und die Mehrwertsteuer
		// Testdaten: 119 Euro brutto => 100 Euro netto, 19 Euro Mehrwertsteuer
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie den Bruttopreis ein.");
		// Deklaration der Variablen und Zuweisung durch den Scanner
		double brutto = sc.nextDouble();
		// Berechnung der Mehrwertsteuer und des Nettopreises
		double netto = brutto / 1.19;
		double mehrwerststeuer = netto * 0.19;
		// Ausgabe der Ergebnisse
		System.out.println("Bruttopreis: " + brutto);
		System.out.println("Nettopreis: " + netto);
		System.out.println("Mehrwertsteuer: " + mehrwerststeuer);
		// Formatierte Ausgabe mit printf
		// %.2f bedeutet, Ausgabe mit 2 Nachkommastellen
		// %n ist ein Zeilenumbruch
		System.out.printf("Bruttopreis: %.2f €%n", brutto);
		System.out.printf("Nettopreis: %.2f €%n", netto);
		System.out.printf("Mehrwertsteuer: %.2f €%n", mehrwerststeuer);
		
	}

}
