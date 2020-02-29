package basics;

public class OperatorenTest {

	public static void main(String[] args) {
		// Deklaration von 2 ganzen Zahlen
		int zahl1;
		int zahl2;
		double zahl3;
		// Zuweisung der Werte
		zahl1 = 42;
		zahl2 = 12;
		zahl3 = 12.0;
		// Arithmetische Operationen (rechnen)
		// Das Ergebnis einer arithmetischen Operation in Java ist mindestens ein int. Ansonsten gilt: der Datentyp des Ergebnisses ist gleich dem 
		// größten beteiligten Datentyp
		// Größe: byte < short < int < long < float < double
		int summe = zahl1 + zahl2;
		System.out.println("summe = " + summe);
		int differenz = zahl1 - zahl2;
		System.out.println("differenz = " + differenz);
		int produkt = zahl1 * zahl2;
		System.out.println("produkt = " + produkt);
		int quotient = zahl1 / zahl2;
		System.out.println("quotient = " + quotient);
		double quotientDouble = zahl1 / zahl2;
		System.out.println("quotientDouble = " + quotientDouble);
		quotientDouble = zahl1 / zahl3;
		System.out.println("quotientDouble = " + quotientDouble);
		quotientDouble = 1.0 * zahl1 / zahl2;
		System.out.println("quotientDouble = " + quotientDouble);
		byte zahl4 = 7;
		byte zahl5 = 12;
		// byte summeByte = zahl4 + zahl5; // Compiler-Fehler: zahl4 + zahl5 ist ein int
		int summeInt =  zahl4 + zahl5;
		System.out.println("summeInt = " + summeInt);
		int modulo = zahl1 % zahl2; // ganzzahliger Rest
		System.out.println("modulo = " + modulo);
		zahl1 = 2;
		zahl2 = 64;
		double potenz = Math.pow(zahl1, zahl2);  // zahl1 hoch zahl2
		System.out.println("potent = " + potenz);
	}

}
