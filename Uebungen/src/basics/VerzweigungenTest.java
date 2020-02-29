package basics;

public class VerzweigungenTest {

	public static void main(String[] args) {
		int zahl = 0;
//		Überprüfen, ob zahl größer als 0 ist
//		Ohne geschweifte Klammern gehört nur die folgende Anweisung zur if-Bedingung
//		Der Ausdruck in Klammern MUSS ein boolean sein!!!
//		if (zahl > 0) {
//			System.out.println("Die Zahl ist größer als 0");
//			System.out.println("Die Zahl ist positiv");
//		} else {
//			System.out.println("Die Zahl ist nicht größer als 0");
//			System.out.println("Die Zahl ist kleiner oder gleich 0");
//		}

//		if (zahl > 0) {
//			System.out.println("Die Zahl ist größer als 0");
//			System.out.println("Die Zahl ist positiv");
//		} else if (zahl < 0){
//			System.out.println("Die Zahl ist kleiner als 0");
//			System.out.println("Die Zahl ist negativ");
//		} else {
//			System.out.println("Die Zahl ist 0");
//		}

//		Reihenfolge der if-Anweisungen ist von großer Bedeutung: hier logisch falsch!
//		if (zahl > 0) {
//			System.out.println("Die Zahl ist größer als 0");
//			System.out.println("Die Zahl ist positiv");
//		} else if (zahl > 100){
//			System.out.println("Die Zahl ist größer als 100");
//		} else {
//			System.out.println("Die Zahl ist nicht größer als 0.");
//		}

//		Überprüfung, ob eingegebene Zahl positiv und gerade ist
		zahl = -11;
//		if (zahl <= 0) {
//			System.out.println("Die eingebene Zahl ist nicht positiv.");
//		} else if (zahl % 2 == 0){
//			System.out.println("Die eingebene Zahl ist positiv und gerade.");
//		} else {
//			System.out.println("Die eingebene Zahl ist ungerade.");
//		}

//		Variante mit Verknüpfung der beiden Bedingungen mit UND-Operator &
//		Short-circuit-Operator && ist performanter: wenn die linke Bedingung false ist, wird die rechte Bedingung nicht mehr ausgewertet
//		if (zahl > 0 && zahl % 2 == 0) {
//			System.out.println(zahl + " ist positiv und gerade.");
//		} else {
//			System.out.println(zahl + " ist nicht positiv oder ungerade.");
//		}

//		Variante mit verschachtelten if-Anweisungen
//		if (zahl > 0) {
//			if (zahl % 2 == 0) {
//				System.out.println(zahl + " ist positiv und gerade.");
//			} else {
//				System.out.println(zahl + " ist positiv und ungerade.");
//			}
//		} else {
//			System.out.println(zahl + " ist nicht positiv.");
//		}

		zahl = 7;
//		Überprüfung, ob eingegebene Zahl positiv oder gerade ist
//		Variante mit dem ODER-Operator | (short-circuit ||)
//		if (zahl > 0 || zahl % 2 == 0) {
//			System.out.println(zahl + " ist positiv oder gerade.");
//		} else {
//			System.out.println(zahl + " ist nicht positiv und ungerade.");
//		}

//		Variante ohne ODER-Verknüpfung
//		if (zahl > 0) {
//			System.out.println(zahl + " ist positiv oder gerade.");
//		} else if (zahl % 2 == 0) {
//			System.out.println(zahl + " ist positiv oder gerade.");
//		} else {
//			System.out.println(zahl + " ist nicht positiv und ungerade.");
//		}
//
//		if (zahl > 0) {
//			System.out.println(zahl + " ist positiv oder gerade.");
//		} else {
//			if (zahl % 2 == 0) {
//				System.out.println(zahl + " ist positiv oder gerade.");
//			} else {
//				System.out.println(zahl + " ist nicht positiv und ungerade.");
//			}
//		}
		
		zahl = -7;
//		Übeprüfung, ob zahl positiv oder gerade ist (oder beides)
		if (zahl > 0 && zahl % 2 == 0) {
			System.out.println(zahl + " ist positiv UND gerade.");
		} else if (zahl > 0 || zahl % 2 == 0) {
			System.out.println(zahl + " ist entweder positiv oder gerade.");
		} else {
			System.out.println(zahl + " ist nicht positiv und ungerade.");
		}
		
//		Variante mit XOR-Operator ^
		if (zahl > 0 ^ zahl % 2 == 0) {
			System.out.println(zahl + " ist entweder positiv oder gerade.");
		} else if (zahl > 0 && zahl % 2 == 0) {
			System.out.println(zahl + " ist positiv UND gerade.");
		} else {
			System.out.println(zahl + " ist nicht positiv und ungerade.");
		}
	}

}




