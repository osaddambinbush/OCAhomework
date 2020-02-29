package ueb;

import java.util.Random;

public class ArrayVergelichTest {

	public static void main(String[] args) {
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		boolean doppelt = false;
		Random r = new Random();
		int gesamt = 0;
		final int ANZAHL = 1_000_000;
		for (int j = 0; j < ANZAHL; j++) {
			for (int i = 0; i < array1.length; i++) {
				array1[i] = r.nextInt(51);
				array2[i] = r.nextInt(51);
			}
			doppelt = false;
			outer: for (int zahl2 : array2) {
				for (int zahl1 : array1) {
					if (zahl1 == zahl2) {
//						System.out.println(zahl1);
						doppelt = true;
						break outer;
					}
				}
			}
			if (doppelt) {
				gesamt++;
			}
			
		}
		System.out.println("durchschnitt = " + 100.0 * gesamt / ANZAHL);
	}

}
