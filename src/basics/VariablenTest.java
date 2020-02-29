package basics;

public class VariablenTest {

	public static void main(String[] args) {
		System.out.println("Hello world");
//		Deklaration von Variablen (Anmelden beim Betriebssystem)
		int i; // Ganzzahl Speicherg��e 4 Byte
		i = 47058; // Wertzuweisung
		System.out.println("i = " + i); // Ausgabe der Variablen
		i = 42; // Erneute Wertzuweisung
		System.out.println("i = " + i); // Ausgabe der Variablen
		// Deklaration und Wertzuweisung (Initialisierung) in einer Anweisung 
		byte b = 127; // Ganzzahl Wertebereich -128 bis 127
		short s;
		s = 12345; // Ganzzahl Wertebereich -32.768 bis 32.767 
		long l; // Ganzzahl Speichergr��e 8 Byte
		// l = 7567123890; // Compiler-Fehler, da Ganzzahl-Literal gr��er als 4 Byte
		l = 7567123890L; // Compiler wird mitgeteilt, dass Literal als long-Wert gespeichert werden soll (8 Byte)
		float f; // Flie�kommazahl mit einfacher Genauigkeit (7 oder 8 Nachkommastellen) (Speichergr��e 4 Byte)
		// f = 3.14; // Compiler-Fehler, da Flie�kommazahllen-Literale immer 8 Byte gro� sind (double)
		f = 3.14F; // Compiler wird mitgeteilt, dass Literal als float-Wert gespeichert werden soll (4 Byte)
		double d = 3.14; // Flie�kommazahl mit doppelter Genauigkeit (8 Byte)
		boolean istVIP; // Deklaration einer boolean-Variable (Wahrheitswert)
		istVIP = false; // kein VIP
		istVIP = true; // VIP
		System.out.println("istVIP = " + istVIP);
		char c; // Alphanumerischer Datentyp f�r ein Zeichen Wertebereich 2 Byte (0 bis 65.535)
		c = 'j';
		c = 121;
		// c = "n"; // Compiler-Fehler, da String-Wert nicht zu char passt
		System.out.println("c = " + c);
		// Sonderfall 
		String name; // String auch scheinbar primitiv. Der Schein tr�gt: String ist eine Klasse
		name = "Marco";
	}

}
