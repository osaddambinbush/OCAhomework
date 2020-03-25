package uebungen;

import javax.swing.JOptionPane;

public class PwPrüfen {

	public static void main(String[] args) {

		String pw = JOptionPane.showInputDialog(null, "Bitte PW eingeben", "Magic PasswordChecker",
				JOptionPane.PLAIN_MESSAGE);
		boolean kleinbuchstabe = false;
		boolean grossbuchstabe = false;
	    boolean ziffern = false;
		boolean sonderzeichen = false;

		if (pw.length() >= 8) {

			for (int i = 0; i < pw.length(); i++) {

				char ch = pw.charAt(i);
				if (Character.isLetter(ch)) {
					if (Character.isLowerCase(ch)) {
						kleinbuchstabe=true;
					} else {
						grossbuchstabe=true;
					}

				} else {
					if (Character.isDigit(ch)) {
						ziffern=true;
					} else {
						sonderzeichen=true;
					}
				}
			}

			if (kleinbuchstabe && grossbuchstabe && ziffern && sonderzeichen) {
				JOptionPane.showMessageDialog(null, "Sie haben ein gültiges Passwort eingegeben", "Sicheres Passwort",
						JOptionPane.WARNING_MESSAGE);

				System.exit(0);
			} else {
				
				JOptionPane.showMessageDialog(null, "Bitte gültiges Passwort eingeben", "Passwortanforderungen nicht erfüllt",
						JOptionPane.WARNING_MESSAGE);

				System.exit(0);
			}

		} else {
			JOptionPane.showMessageDialog(null, "Bitte gültiges Passwort eingeben", "zu kurzes Passwort",
					JOptionPane.WARNING_MESSAGE);

			System.exit(0);
		}

	
	}

}
