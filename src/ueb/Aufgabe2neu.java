package ueb;

import java.util.Random;

public class Aufgabe2neu {

	public static void main(String[] args) {
		int[] zahlen1 = new int[10];
		int[] zahlen2 = new int[10];
		
		Random r = new Random();
		
		for(int i = 0; i<zahlen1.length; i++) {
			zahlen1[i] = r.nextInt(51);
			zahlen2[i] = r.nextInt(51);
		}
		System.out.println("Inhalt Array Zahlen1");
		for(int a : zahlen1) {
			System.out.println(a );
		}
			
			System.out.println("Inhalt Array Zahlen2");
			for(int b : zahlen2) {
			System.out.println(b);
			}
	}
		

}
