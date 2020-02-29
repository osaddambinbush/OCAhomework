package basics;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// Erzeugen eines Scanner-Objekts zur Benutzeingabe
		Scanner sc = new Scanner(System.in);
		// Eingabe durch den Benutzer über die Konsole
		System.out.println("Bitte geben Sie eine ganze Zahl ein.");
		int zahl = sc.nextInt();
		System.out.println("zahl = " + zahl);
		System.out.println("Bitte geben Sie eine Kommazahl ein.");
		double kommaZahl = sc.nextDouble();
		System.out.println("kommaZahl = " + kommaZahl);
		System.out.println("Bitte geben Sie Ihren Namen ein.");
		String name = sc.next();
		System.out.println("Hallo " + name);
		
	}

}
