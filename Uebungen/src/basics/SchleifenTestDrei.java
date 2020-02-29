package basics;

public class SchleifenTestDrei {

	public static void main(String[] args) {
		// Ausgabe des groﬂen Einmaleins
		// Beispiel 11 * 11 = 121, 11 * 12 = 132, ..., 11 * 20 = 220, 12 * 11 = 132,
//		// ..., 20 * 20 = 400
//		for (int i = 11; i <= 20; i++) {
//			for (int j = 11; j <= 20; j++) {
//				System.out.println(i + " * " + j + " = " + i * j);
//			}
//		}
		System.out.println("****************************************");
//		int i = 10;
//		int j = 11;
//		// Pr‰inkrement: ++ vor der Variablen
//		// zuerst Inkrement, dann Operation
//		while (++i <= 20) {
//			while (j <= 20) {
//				// Postinkrement: ++ hinter der Variablen
//				// zuerst Operation, dann Inkrement
//				System.out.println(i + " * " + j + " = " + i * j++);
//			}	
//			j = 11;
//		}

		int kombination = 115;

//		Defintion eines Labels (funktioniert NUR vor einer Schleife!)
		outer: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					if (i * 100 + j * 10 + k == kombination) {
						System.out.println("*****TREFFER***** " + i + j + k);
//						break; // bricht NUR die Schleife ab, in der sich das break befindet
//						continue outer;
						break outer;
					} else {
						System.out.println("Niete: " + i + j + k);
					}
				}
			}
		}

		System.out.println("Servus");

	}

}
