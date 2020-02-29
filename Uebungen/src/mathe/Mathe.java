package mathe;

public class Mathe {
	
	public static final int CIBO = 5051;
	
	public static long berechneFakultaet(int zahl) {
		long fakultaet = 1;
		for (int i = 1; i <= zahl; i++) {
			fakultaet *= i;
		}
		return fakultaet;
	}
	
	public static long berechneFakultaetRekursiv(int zahl) {
//		Abbruchbedingung der Rekursion
		if (zahl == 0) {
			return 1;
		}
		return zahl * berechneFakultaetRekursiv(zahl - 1);
	}
	
	public static long fibonacci(int zahl) {
		if(zahl <= 2) {
			return zahl - 1;
		}
		return fibonacci(zahl - 1) + fibonacci(zahl - 2);
	}

}
