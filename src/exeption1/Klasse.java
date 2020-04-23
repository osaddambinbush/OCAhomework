package exeption1;

public class Klasse {
	public static void main(String[] args) {
////  Übung: Bitte stellen Sie sicher, dass bei der Wandlung des Strings in ein int, keine Fehlermeldung den PRG-Ablauf stoppen kann.
		String eingabe = "19%";

		for (int i = 0; i < eingabe.length(); i++) {

			if (Character.isDigit(eingabe.charAt(i))) {
				int a = Character.getNumericValue(eingabe.charAt(i));
				System.out.print(a);
			} else
				System.out.print(eingabe.charAt(i));
		}


	}
}
