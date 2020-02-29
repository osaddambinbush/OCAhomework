package ueb;

import java.math.BigInteger;

public class GaussTest {

	public static void main(String[] args) {
		// Summe über die ersten 100 natürlichen Zahlen
		int gaussSumme = 0;
		for (int i = 1; i <= 100; i++) {
			gaussSumme  += i;
		}		
		System.out.println("Die Summe lautet " + gaussSumme);
		
		// Anzahl der Möglichkeiten, 15 Schüler auf 15 Plätze zu verteilen
		// Lösung 15! = 15 * 14 * 13 * 12 * ... * 1
		int anzahlSchueler = 15;
		long fakultaet = 1;
		for (int i = 1; i <= anzahlSchueler; i++) {
			fakultaet *= i;
		}
		System.out.println("Die Fakultät lautet " + fakultaet);
		System.out.printf("Die Fakultät lautet %,d%n", fakultaet);
		
		anzahlSchueler = 25;
		BigInteger fakultaetBig = BigInteger.ONE;
		for (int i = 1; i <= anzahlSchueler; i++) {
			fakultaetBig = fakultaetBig.multiply(BigInteger.valueOf(i));
		}
		System.out.println("Die Fakultät lautet " + fakultaetBig);
		System.out.printf("Die Fakultät lautet %,d%n", fakultaetBig);
		System.out.println("Anzahl der Ziffern: " + fakultaetBig.toString().length());
		
		// Ausgabe der ersten 50 Fibonacci-Zahlen
		// Die erste Fibonacci-Zahl ist 0, die zweite ist 1. Alle weiteren Fibonacci-Zahlen ergeben sich aus der Summe ihrer beiden Vorgänger.
	}

}










