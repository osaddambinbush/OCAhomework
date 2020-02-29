package ueb;

import java.math.BigInteger;

public class GaussTest {

	public static void main(String[] args) {
		// Summe �ber die ersten 100 nat�rlichen Zahlen
		int gaussSumme = 0;
		for (int i = 1; i <= 100; i++) {
			gaussSumme  += i;
		}		
		System.out.println("Die Summe lautet " + gaussSumme);
		
		// Anzahl der M�glichkeiten, 15 Sch�ler auf 15 Pl�tze zu verteilen
		// L�sung 15! = 15 * 14 * 13 * 12 * ... * 1
		int anzahlSchueler = 15;
		long fakultaet = 1;
		for (int i = 1; i <= anzahlSchueler; i++) {
			fakultaet *= i;
		}
		System.out.println("Die Fakult�t lautet " + fakultaet);
		System.out.printf("Die Fakult�t lautet %,d%n", fakultaet);
		
		anzahlSchueler = 25;
		BigInteger fakultaetBig = BigInteger.ONE;
		for (int i = 1; i <= anzahlSchueler; i++) {
			fakultaetBig = fakultaetBig.multiply(BigInteger.valueOf(i));
		}
		System.out.println("Die Fakult�t lautet " + fakultaetBig);
		System.out.printf("Die Fakult�t lautet %,d%n", fakultaetBig);
		System.out.println("Anzahl der Ziffern: " + fakultaetBig.toString().length());
		
		// Ausgabe der ersten 50 Fibonacci-Zahlen
		// Die erste Fibonacci-Zahl ist 0, die zweite ist 1. Alle weiteren Fibonacci-Zahlen ergeben sich aus der Summe ihrer beiden Vorg�nger.
	}

}










