package basics;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {

	public static void main(String[] args) {
		int[] lottozahlen = new int[6];
//		Alternative für Zufallszahlen zu Math.random()
		Random r = new Random();
//		Hilfsvariable: flag
		boolean doppelt;
		for (int i = 0; i < lottozahlen.length; i++) {
			do {
				// lottozahlen[i] = (int) (Math.random() * 49) + 1;
				lottozahlen[i] = r.nextInt(49) + 1;
				doppelt = false;
				for (int j = 0; j < i; j++) {
					if (lottozahlen[j] == lottozahlen[i]) {
						doppelt = true;
					}
				}
			} while (doppelt);
		}

//		Sortierung des Arrays
		Arrays.sort(lottozahlen);
		for (int lottozahl : lottozahlen) {
			System.out.println(lottozahl);
		}
		System.out.println("*****************************");
//		Array deklarieren und füllen mit Literalen
		int[] zahlen = {1, 2, 3, 4, 5, 6};
		for (int zahl : zahlen) {
			System.out.println(zahl);
		}
		String[] tiere = {"Hund", "Katze", "Maus"};
	}
}


















