package ueb;

import java.util.Random;

public class Aufgabe2 {

	public static void main(String[] args) {
		int[] zahlen1 = new int[10];
		int[] zahlen2 = new int[10];

		Random r = new Random();
		boolean doppelt;

		schleife1: for (int i = 0; i < zahlen1.length; i++) {
			do {
				zahlen1[i] = r.nextInt(50);
				doppelt = false;

				for (int j = 0; j < zahlen2.length; j++) {
					zahlen2[j] = r.nextInt(50);
					doppelt = false;
					if (zahlen2[j] == zahlen1[i]) {
						doppelt = true;
						System.out.println("*************TREFFER****************");
						System.out.println("Array 1: " + zahlen1[i]);
						System.out.println("Array 2: " + zahlen2[j]);
						System.out.println("*************TREFFER****************");
						
						break schleife1;
						
					}else {
						System.out.println("*****************************");
						System.out.println("Array 1: " + zahlen1[i]);
						System.out.println("Array 2: " + zahlen2[j]);
						System.out.println("*****************************");
					}

				}
			} while (doppelt);

		}
//		for (int array1 : zahlen1) {
//
//			for (int array2 : zahlen2) {
//				System.out.println("*****************************");
//				System.out.println("Array 1: " + array1);
//				System.out.println("Array 2: " + array2);
//				System.out.println("*****************************");
//			}
//
//		}

	}

}
