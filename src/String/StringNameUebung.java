package String;

public class StringNameUebung {

	public static void main(String[] args) {

		String[] komplettName = new String[6];
		komplettName[0] = "Müller, Klaus";
		komplettName[1] = "Meier, Klara";
		komplettName[2] = "Schulze,Rita";
		komplettName[3] = "Schmitz, Hubert";
		komplettName[4] = "Kruse, Sonja";
		komplettName[5] = " Schmidt, Heinrich";

		for (int i = 0; i < komplettName.length; i++) {
			int istKomma = 0;
			String nachName = "";

			istKomma = komplettName[i].indexOf(",");
			nachName = komplettName[i].substring(0, istKomma);
			String vorName = komplettName[i].substring(istKomma+1);

			System.out.println("Hallo " + vorName.trim() + " " + nachName.trim());

		}

	}

}
