package ueb;

public class TeilerSucheTest {

	public static void main(String[] args) {
//		int zahl = 97;
		
		for (int j = 1; j <= 100; j++) {
//			System.out.print(j + ": ");
//			for (int i = 1; i <= j; i++) {
//				if (j % i == 0) {
//					System.out.print(i + " ");
//				}
//			} 
			teilerSuche(j);
			System.out.println();
		}
		
		System.out.println("*************************");
		long start = System.currentTimeMillis();
		teilerSuche(Integer.MAX_VALUE -1);
		long stop = System.currentTimeMillis();
		System.out.println("Dauer in Sekunden = " + (stop - start) / 1000.0);
	}
	
	public static void teilerSuche(int zahl) {
		System.out.print(zahl + ": 1 ");
		int haelfte = zahl / 2;
		for (int i = 2; i <= haelfte; i++) {
			if (zahl % i == 0) {
				System.out.print(i + " ");
			}
		} 
		System.out.println(zahl);
	}

}
