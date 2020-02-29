package ueb;

public class WuerfelspielTest {

	public static void main(String[] args) {
		int wuerfel1, wuerfel2, augensumme;
		double gewinn = 0.5;
		final int ANZAHL_SPIELE = 1_000;
		double gesamtGewinn = 0;

		for (int j = 0; j < ANZAHL_SPIELE; j++) {
			for (int i = 1; i <= 1000; i++) {
				wuerfel1 = (int) (Math.random() * 6) + 1;
				wuerfel2 = (int) (Math.random() * 6) + 1;
				augensumme = wuerfel1 + wuerfel2;

				if (augensumme == 12) {
					gewinn += 1.5;
				} else if (augensumme == 11) {
					gewinn += 1;
				} else if (augensumme == 10) {
					gewinn += 0.5;
				} else if (augensumme < 7) {
					gewinn -= 0.5;
				}
			}
			if (gewinn > 0 ) {
				System.out.println("Hurra!");
			}
			gesamtGewinn += gewinn;
			gewinn = 0.5;
		}
		
		System.out.println("Ihr durchschnittlicher Gewinn bei " + ANZAHL_SPIELE +  " Spielen ist " + (gesamtGewinn / ANZAHL_SPIELE));

	}

}
