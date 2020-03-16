package ueb;

import java.util.Random;

public class MHA2 {

  public static void main(String[] args) {
    {
//    Erzeugen Sie zwei int-Arrays zahlen1 und zahlen2...
      int[] zahlen1 = new int[10];
      int[] zahlen2 = new int[10];

//     ...mit jeweils 10 zufälligen Elementen von 0 bis 50...
      Random r = new Random();
      for (int i = 0; i < zahlen1.length; i++) {
        zahlen1[i] = r.nextInt(51);
        zahlen2[i] = r.nextInt(51);
      }

//     ...Lassen Sie sich beide Arrays ausgeben.
      System.out.println("==== Inhalt des int-Arrays zahlen1 =====");
      for (int element : zahlen1) {
        System.out.println(element);
      }
      System.out.println("==== Inhalt des int-Arrays zahlen2 =====");
      for (int element : zahlen2) {
        System.out.println(element);
      }
      System.out.println("==== erste gemeinsame Element ausgegeben und ENDE =====");
// Vergleichen Sie beide Arrays derart, dass entweder das erste gemeinsame Element ausgegeben wird (sofortiger Schleifenabbruch) ...
      for (int numberArray1 : zahlen1) {
        for (int numberArray2 : zahlen2) {
          if (numberArray1 == numberArray2) {
            System.out.println(numberArray1);
            break; // bricht nur innere Schleife ab: einige weitere identische Elemente werden
                   // ausgegeben.
          }
        }
      }

      System.out.println("==== Berichtigung: erste gemeinsame Element ausgegeben und ENDE =====");
// Vergleichen Sie beide Arrays derart, dass entweder das erste gemeinsame Element ausgegeben wird (sofortiger Schleifenabbruch) ...
      ENDE: for (int numberArray1 : zahlen1) {
        for (int numberArray2 : zahlen2) {
          if (numberArray1 == numberArray2) {
            System.out.println(numberArray1);
            break ENDE; // aus innerer Schleife auch die Äussere beenden.
          }
        }
      }

//Erweiterung    
//    oder ausgegeben wird, dass es keine gemeinsamen Elemente gibt
      System.out
          .println("==== erste gemeinsame Element ausgegeben und ENDE bzw. Ausgabe, dass keine Übereinstimmung =====");
// Vergleichen Sie beide Arrays derart, dass entweder das erste gemeinsame Element ausgegeben wird (sofortiger Schleifenabbruch) ...
      // oder ausgegeben wird, dass es keine gemeinsamen Elemente gibt
      int counter = 0;
      ENDE: for (int numberArray1 : zahlen1) {
        for (int numberArray2 : zahlen2) {
          if (numberArray1 == numberArray2) {
            System.out.println(numberArray1);
            counter++;
            break ENDE;
          }
        }
      }
      if (counter == 0)
        System.out.println("Keine Übereinstimmung");

      // Modifikation: nicht zählen mit counter, sondern boolean verwenden
//  oder ausgegeben wird, dass es keine gemeinsamen Elemente gibt
      System.out.println(
          "==== alle gemeinsamen Element ausgegeben und deren Anzahl bzw. Ausgabe, dass keine Übereinstimmung mit boolean =====");
//Vergleichen Sie beide Arrays derart, dass entweder das erste gemeinsame Element ausgegeben wird (sofortiger Schleifenabbruch) ...
      // oder ausgegeben wird, dass es keine gemeinsamen Elemente gibt
      boolean keineUebereinstimmung = true;
      counter = 0;
      ENDE: for (int numberArray1 : zahlen1) {
        for (int numberArray2 : zahlen2) {
          if (numberArray1 == numberArray2) { // 100 (10*10) Tests
            System.out.println(numberArray1);
            counter++;
            keineUebereinstimmung = false;
//        break ENDE; 
          }
        }
      }
      if (keineUebereinstimmung)
        System.out.println("Keine Übereinstimmung");
      System.out.println("Anzahl der Übereinstimmungen:" + counter);

// Modifikation: nicht zählen mit counter, sondern boolean verwenden  
//oder ausgegeben wird, dass es keine gemeinsamen Elemente gibt
      System.out.println(
          "==== jetzt mit Häufigkeit! alle gemeinsamen Element ausgegeben und deren Anzahl bzw. Ausgabe, dass keine Übereinstimmung mit boolean =====");
//Vergleichen Sie beide Arrays derart, dass entweder das erste gemeinsame Element ausgegeben wird (sofortiger Schleifenabbruch) ...
//    oder ausgegeben wird, dass es keine gemeinsamen Elemente gibt
      keineUebereinstimmung = true;
      counter = 0;
      int zaehlMich;
      for (zaehlMich = 0; zaehlMich < 100; zaehlMich++) {
        for (int i = 0; i < zahlen1.length; i++) {
          zahlen1[i] = r.nextInt(51);
          zahlen2[i] = r.nextInt(51);
        }
        ENDE: for (int numberArray1 : zahlen1) {
          for (int numberArray2 : zahlen2) {
            if (numberArray1 == numberArray2) { // 100 (10*10) Tests
//            System.out.println(numberArray1);
              counter++;
              keineUebereinstimmung = false;
              break ENDE;
            }
          }
        }
        if (keineUebereinstimmung)
          ;
//        System.out.println("Keine Übereinstimmung");
//      System.out.println("Anzahl der Übereinstimmungen:" + counter);
      }
      System.out.println("FEHLER! Rel. Häufigkeit: " + counter / zaehlMich * 100 + "%");
    }
    {
      int[] zahlen1 = new int[10];
      int[] zahlen2 = new int[10];
      Random random = new Random();
      int counter = 0;
      int durchlaeufe=1_000;
      double relativeHaeufigkeit;
      for (int m = 0; m < durchlaeufe; m++) {
        for (int i = 0; i < zahlen1.length; i++) {
          zahlen1[i] = random.nextInt(51);
          zahlen2[i] = random.nextInt(51);
        }
        ENDE: for (int i = 0; i < zahlen1.length; i++) {
          for (int j = 0; j < zahlen2.length; j++) {
            if (zahlen1[i] == zahlen2[j]) {
              counter++;
              break ENDE;
            }
          }
        }
      }
      System.out.println("*************");
       relativeHaeufigkeit =(double)counter/durchlaeufe*100;
      System.out.println("Relative Häufigkeit = " + relativeHaeufigkeit + "%");
    }
  } // EndOfMain
}
