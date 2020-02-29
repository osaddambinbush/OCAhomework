package ueb;

import java.util.Scanner;

public class SchaltjahrTest {

	public static void main(String[] args) {
		// Nach Benutzeringabe einer Jahreszahl soll ausgegeben werden, ob das Jahr ein
		// Schaltjahr ist oder nicht
		System.out.println("Bitte geben Sie eine Jahreszahl ein.");
		Scanner sc = new Scanner(System.in);
		int jahr = sc.nextInt();
		sc.close();
		// Julianische Schaltjahrregel: Ein Jahr ist ein Schaltjahr, wenn es durch 4
		// teilbar ist
		// Beispiel: Eingabe: 2020 => Ausgabe:2020 ist ein Schaltjahr
		// Beispiel: Eingabe: 2021 => Ausgabe:2021 ist kein Schaltjahr
		if (jahr % 4 == 0) {
			System.out.println(jahr + " ist ein Schaltjahr");
		} else {
			System.out.println(jahr + " ist kein Schaltjahr");
		}
		// Alternative mit Konditionaloperator (wenn - dann -sonst)
		String s = jahr % 4 == 0 ? "" : "k";
		System.out.println(jahr + " ist " + s + "ein Schaltjahr");
//		System.out.println(jahr + " ist " + (jahr % 4 == 0 ? "" : "k") + "ein Schaltjahr");		

		// Gregorianische Schaltjahrregel: Ein Jahr ist ein Schaltjahr, wenn es durch 4
		// teilbar ist. Ausnahme: eine Jahrhundertwende ist
		// nur dann ein Schaltjahr, wenn sie durch 400 teilbar ist
		// Beispiel: Eingabe: 2000 => Ausgabe:2000 ist ein Schaltjahr
		// Beispiel: Eingabe: 2100 => Ausgabe:2100 ist kein Schaltjahr
		// Vergleichsoperator ==, Ungleichheitsoperator !=
//		boolean istSchaltjahr;
//		if (jahr % 4 == 0) {
//			if (jahr % 100 == 0) {
//				if (jahr % 400 == 0) {
//					istSchaltjahr = true;
//				} else {
//					istSchaltjahr = false;
//				}				
//			} else {
//				istSchaltjahr = true;
//			}			
//		} else {
//			istSchaltjahr = false;
//		}
//		System.out.println(jahr + " ist " + (istSchaltjahr ? "" : "k") +  "ein Schaltjahr");
		
//		Jahr durch 4 teilbar und keine Jahrhundertwende ODER Jahr durch 400 teilbar
//		Priorität: UND vor ODER!
		if (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0) {
			System.out.println(jahr + " ist ein Schaltjahr");
		} else {
			System.out.println(jahr + " ist kein Schaltjahr");
		}
	}

}











