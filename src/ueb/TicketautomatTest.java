package ueb;

import java.util.Arrays;
import java.util.Scanner;

public class TicketautomatTest {

	public static void main(String[] args) {
		start: while (true) {
			Scanner sc = new Scanner(System.in);
			String preisstufe;
			System.out.println("Bitte geben Sie die gewünschte Preisstufe ein.");
			System.out.println("Tarifzone: K -  1,40 €.");
			System.out.println("Tarifzone: A -  2,30 €.");
			System.out.println("Tarifzone: B -  4,70 €.");
			System.out.println("Tarifzone: C -  9,60 €.");
			System.out.println("Tarifzone: D - 11,40 €.");
			preisstufe = sc.next();
			int fahrpreis;
			switch (preisstufe) {
			case "K":
				fahrpreis = 140;
				break;
			case "A":
				fahrpreis = 230;
				break;
			case "B":
				fahrpreis = 470;
				break;
			case "C":
				fahrpreis = 960;
				break;
			case "D":
				fahrpreis = 1140;
				break;
			default:
				fahrpreis = 0;
			}
			if (fahrpreis == 0) {
				System.err.println("Sie haben eine ungültige Preisstufe gewählt.");
				continue;
			}
			System.out.printf("Sie haben Preisstufe %s gewählt. Bitte zahlen Sie %.2f €.%n", preisstufe, fahrpreis / 100.);
			int einwurf; 
			int restbetrag = fahrpreis;
			int[] gueltigeGeldwerte = {5, 10, 20, 50, 100, 200, 500, 1000, 2000};
			while (true) {
				do {
					einwurf = sc.nextInt();
				} while (Arrays.binarySearch(gueltigeGeldwerte, einwurf) < 0);
				restbetrag -= einwurf;
				if (restbetrag > 0) {
					System.out.printf("Sie haben %.2f € gezahlt. Restbetrag: %.2f €%n", einwurf/100., restbetrag/100.);
				} else if (restbetrag < 0) {
					System.out.printf("Sie haben %.2f € gezahlt. Vielen Dank. Sie bekommen zurück: %.2f €%n", einwurf/100., -restbetrag/100.);
					break;
				} else {
					System.out.printf("Sie haben %.2f € gezahlt. Vielen Dank.", einwurf/100.);
					continue start;
				}
			}
			
			int[] muenzen = {200, 100 , 50, 20, 10};
			restbetrag *= -1;
			System.out.println("Ausgabe Restgeld:");
//			do {
//				for (int muenze : muenzen) {
//					if (muenze <= restbetrag) {
//						System.out.println(muenze / 100. + " €");
//						restbetrag -= muenze;
//						break;
//					}
//				}
//			} while (restbetrag > 0);
			
			do {
				for (int muenze : muenzen) {
					if (restbetrag / muenze >= 1) {
						System.out.println(restbetrag / muenze + " * " + muenze/100. + " €");
						restbetrag = restbetrag % muenze;
					}
				}
			} while (restbetrag > 0);
			System.out.println("Servus\n");			
		}
	}

}
