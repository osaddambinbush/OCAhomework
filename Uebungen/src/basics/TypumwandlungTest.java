package basics;

public class TypumwandlungTest {

	public static void main(String[] args) {
		// Typumwandlung = casting
		int intVar = 42;
		double doubleVar = Math.PI;
		System.out.println("intVar = " + intVar);
		System.out.println("doubleVar = " + doubleVar);
		doubleVar = intVar; // implizites Casting: der Compiler passt den Datentypen an. Aus int wird
							// double. Stichpunkt: Widening (verbreitern)
		System.out.println("intVar = " + intVar);
		System.out.println("doubleVar = " + doubleVar);
		intVar = 42;
		doubleVar = Math.PI;
		// intVar = doubleVar; // Compiler-Fehler: der Ausdruck rechts ist "breiter" als
		// der linke
		intVar = (int) doubleVar; // explizites Casting
		System.out.println("intVar = " + intVar);
		System.out.println("doubleVar = " + doubleVar);
		byte zahl1 = 120;
		byte zahl2 = 10;
		byte summe = (byte) (zahl1 + zahl2);
		System.out.println("summe = " + zahl1 + zahl2);
		System.out.println("summe = " + (zahl1 + zahl2));
		System.out.println("summe = " + summe);
		byte zahl = 100;
		System.out.println("zahl = " + zahl);
		// Wert von zahl um 1 erhöhen
		zahl++; // Inkrement-Operator
		// oder ++zahl;
		zahl += 1;
		zahl = (byte) (zahl + 1);
		System.out.println("zahl = " + zahl);
		long l = 7678901234L;
		float f = 3.14F;
		// f = l; // compiliert: implizites casting
		// l = f; // compiler-Fehler
		l = (long) f;
		System.out.println("l = " + l);
		long potenz = (long) Math.pow(2, 32); // casting von double auf int. Achtung: unvorhergesehene Ergebnisse möglich!
		System.out.println("potenz = " + potenz);
	}

}
