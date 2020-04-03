package uebungen;

public class RequestArgs {

	public static void main(String[] args) {

		// Bitte die ausgegebenen args umdrehen und nur der jeweilige Anfangsbuchstabe
		// soll groß
 m("fahiehn  blubb fmesaiogmsao");
		
	}
static void m(String... s) {
	String output = "";
		
	if (s.length > 0) {

			for (int i = 0; i < s.length;i++) {
				StringBuilder sB = new StringBuilder(s[i].toLowerCase());
				sB.reverse().replace(0, 1, sB.toString().substring(0, 1).toUpperCase());
				String element = sB.toString();
				output += element + " ";
				System.out.println(element);

			}
			System.out.println(output);

		} else {
			System.out.println("no arguments");
		}
	}
static String m(String s, String a, String c, String d) {return "";}

}


