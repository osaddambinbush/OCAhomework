package ueb;

import java.util.Random;

public class BitcoinKonto {

	public static void main(String[] args) {
		Random r = new Random();
		int randomWert = 0;
		String bitCoin = "";

		boolean einsOderDrei = r.nextBoolean();
		if (einsOderDrei) {
			bitCoin = bitCoin + "1";
		} else {
			bitCoin = bitCoin + "3";
		}

		for (int i = 1; i <= 34 - 1;) {
			randomWert = r.nextInt(122 + 1);
			if (randomWert >= 49 && randomWert <= 57 || // Ziffern OHNE 0
					randomWert >= 65 && randomWert <= 72 || randomWert >= 74 && randomWert <= 78
					|| randomWert >= 80 && randomWert <= 90 || // Großbuchstaben ohne I ohne O
					randomWert >= 97 && randomWert <= 107 || randomWert >= 109 && randomWert <= 122) { // Kleinbuchstaben
																										// ohne l

				char zeichen = (char) randomWert;
				bitCoin += zeichen;
				i++;
				if (i > 0 && i % 4 == 0 && i != 34 && i % 12 != 0) {
					bitCoin += "-";

				}
				if (i > 0 && i % 12 == 0 && i != 34) {

					bitCoin += "\n";

				}
			}

		}
		System.out.print(bitCoin);
	}
}
