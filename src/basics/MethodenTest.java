package basics;

import mathe.Mathe;

public class MethodenTest {

	public static void main(String[] args) {
		int zahl = 10;
//		long fakultaet = berechneFakultaet(zahl);
//		System.out.println(zahl + "! = " + fakultaet);
//		printFakultaet(zahl);
		long fakultaet = mathe.Mathe.berechneFakultaetRekursiv(zahl);
		System.out.println(zahl + "! = " + fakultaet);
		System.out.println(Mathe.CIBO);
	}
	

	
	public static void printFakultaet(int zahl) {
		System.out.printf("%d! = %,d%n", zahl, Mathe.berechneFakultaet(zahl));
	}

}
