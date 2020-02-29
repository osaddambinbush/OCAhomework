package basics;

public class SwitchTest {

	public static void main(String[] args) {
//		Deklaration einer Variablen für den Kartenwert
		char karte = 'Z';

//		switch funktioniert bei Variablen vom Typ byte, short, int und char, seit Java 7 auch mit String
		switch (karte) {
			case '7':
				System.out.println("zwei ziehen");
				break;
			case '8':
				System.out.println("aussetzen");
				break;
			case 'B':
				System.out.println("Farbe wünschen");
				break;
			default:
				System.out.println("normal weiter");
		}

		String karteString = "B"; // funktioniert seit Java 7

		switch (karteString) {
			case "7":
				System.out.println("zwei ziehen");
				break;
			case "8":
				System.out.println("aussetzen");
				break;
			default:
				System.out.println("normal weiter");
				break;
			case "B":
				System.out.println("Farbe wünschen");
				break;			
		}
	}

}
