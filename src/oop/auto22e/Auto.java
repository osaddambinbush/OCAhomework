package oop.auto22e;

public class Auto { 
  private String name;  static String klangfarbe;
  public Auto(String name) { 
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public void hup() {
    System.out.println("hup"); 
  }

  public void hup(int anzahl, String klangfarbe) {
    for (int i = 1; i <= anzahl; i++) {
      hup(klangfarbe); 
    }
  }
//    Übung: weiteres Überladen von hup.
//    Bitte schreiben Sie eine hup()-Methode, die einen String nimmt (f. d. Klangfarbe): Wort, das ausgegeben werden soll.
    public void hup(String klangfarbe)  {
    	klangfarbe = "mööp";
   System.out.println(klangfarbe);
    }
  
  public static void main(String[] args) {
    Auto a1 = new Auto("Karin");
    a1.hup(33, klangfarbe); 
    a1.hup(); 
  }
}
