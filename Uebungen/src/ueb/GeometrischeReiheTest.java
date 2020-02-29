package ueb;

public class GeometrischeReiheTest {

	public static void main(String[] args) {
		double grenzwert = 0;
//		final bei einer Variablendeklaration bedeutet, dass die Variable nicht reinitialisiert werden kann (keine erneute Zuweisung) => Konstante in Java
		final int OBERGRENZE = 100;

		for (int i = 0; i < OBERGRENZE; i++) {
			grenzwert += 1 / Math.pow(2, i);
		}

		System.out.println("Der Grenzwert bei n = " + OBERGRENZE + " ist " + grenzwert);

		grenzwert = 0;
		int n = 0;
		double temp = 0;
		
//		while(true) {
//			temp = grenzwert; 
//			grenzwert += 1 / Math.pow(2, n++);
//			if(temp == grenzwert) {
//				n--;
//				break;
//			}
//		}
		
		do {
			temp = grenzwert; 
			grenzwert += 1 / Math.pow(2, n++);
		} while (temp != grenzwert);
		
		System.out.println("Der Grenzwert ist " + grenzwert);
		System.out.println("n = " + --n);
	}

}
