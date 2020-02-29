package ueb;

import mathe.Mathe;

public class FibonacciTest {

	public static void main(String[] args) {
		// Ausgabe der ersten 50 Fibonacci-Zahlen
		// Die erste Fibonacci-Zahl ist 0, die zweite ist 1. Alle weiteren
		// Fibonacci-Zahlen ergeben sich aus der Summe ihrer beiden Vorgänger.
//		long fibo, fiboVor, fiboVorVor;
//		fiboVorVor = 0;
//		fiboVor = 1;
//		System.out.println("1. Fibonacci-Zahl = " + fiboVorVor);
//		System.out.println("2. Fibonacci-Zahl = " + fiboVor);
//		
//		for (int i = 3; i <= 50; i++) {
//			fibo = fiboVor + fiboVorVor;
//			fiboVorVor = fiboVor;
//			fiboVor = fibo;
////			System.out.println(i + ". Fibonacci-Zahl = " + fibo);
//			System.out.printf("%d. Fibonacci-Zahl = %,d%n", i , fibo);
//		}

//		Fibonacci-Zahlen in einem Array
//		Index in einem Array startet mit 0!
//		Ein Array ist ein Feld gleichartiger Variablen und hat eine feste Größe, die bei der Erzeugung des Arrays definiert wird (nicht bei der Deklaration)
		final int ANZAHL = 50;
		long[] fibonacciZahlen = new long[ANZAHL];
		fibonacciZahlen[0] = 0;
		fibonacciZahlen[1] = 1;

//		Das Feld length gibt beim Array die Anzahl der Elemente zurück
		for (int i = 2; i < fibonacciZahlen.length; i++) {
			fibonacciZahlen[i] = fibonacciZahlen[i - 1] + fibonacciZahlen[i - 2];
		}
		
//		Ausgabe der Werte des Arrays
		for (int i = 0; i < fibonacciZahlen.length; i++) {
			System.out.printf("%d. Fibonacci-Zahl = %,d%n", i + 1, fibonacciZahlen[i]);
		}
		System.out.println("****************************************");
//		Vereinfachte Schleife zur Iteration über ein Array
//		Erweiterte for-Schleife (for each-Schleife)
//		Nur für lesenden Zugriff!
		for (long fibo : fibonacciZahlen) {
			System.out.printf("%,d%n", fibo);
		}
		
		System.out.println("****************************************");
		
		for (int i = 1; i <= ANZAHL; i++) {
			System.out.printf("%d. Fibonacci-Zahl = %,d%n", i, Mathe.fibonacci(i));
		}
		
		
	}
	
	

}






