package String;

public class StringNameUebung {

	public static void main(String[] args) {

		 String[] komplettName = { 
			        "  d   ,   Beispiel,   Ein  ", 
			        "m, Müller, Klaus", 
			        "w, Meier,   Klara", 
			        "w, Schulze,Rita", 
			        "m, Schmitz, Hubert",
			        "m, Kruse, Sonja", 
			        "m, Schmidt,   Heinrich   " 
			        };
			    int indexKomma1, indexKomma2;
			    String vorName, nachName, sex, hi1, hi2, hi3;

			    for (int i = 0; i < komplettName.length; i++) {
			      indexKomma1 = komplettName[i].indexOf(",");
			      indexKomma2 = komplettName[i].indexOf(",", indexKomma1 + 1);

			      sex = komplettName[i].substring(0, indexKomma1).trim();
			      nachName = komplettName[i].substring(indexKomma1 + 1, indexKomma2).trim();
			      vorName = komplettName[i].substring(indexKomma2 + 1).trim();

//			      ~~~~~~~  Verson 1  (ternär) ~~~~~~~
			      hi1 = "Hallo" + (sex.equals("w") ? " Frau " : sex.equals("m") ? " Herr " : " . ");
			      System.out.println("1: " + hi1 + vorName + " " + nachName);

//			      ~~~~~~~  Verson 2  if() ~~~~~~~
			      if (sex.equals("w")) {
			        hi2 = " Frau ";
			      } else if (sex.equals("m")) {
			        hi2 = " Herr ";
			      } else {
			        hi2 = " .. ";
			      }
			      hi2 = "Hallo" + hi2;
			      System.out.println("2: " + hi2 + vorName + " " + nachName);

//			      ~~~~~~~  Verson 3  switch-case ~~~~~~~
			      switch (sex) {
			      case "w":
			        hi3 = " Frau ";
			        break;
			      case "m":
			        hi3 = " Herr ";
			        break;

			      default:
			        hi3 = " ... ";
			        break;
			      }
			      hi3 = "Hallo" + hi3;
			      System.out.println("3: " + hi3 + vorName + " " + nachName + "\n");
			    }
		

}
}

	