package ueb;

import java.util.Random;

public class BitCoin {

  public static void main(String[] args) {
    {
      int start = 65;
      int randomWert = 40;
      System.out.println((char) start + (char) randomWert); // 105
      System.out.println('A' + 'B'); // gibt Zahl aus: 131
      System.out.println((char) (start + randomWert)); // i
      System.out.println("" + (char) start + (char) randomWert); // A(
    }
    {
      System.out.println("=====================");
      String bitCoin = "";
      Random r = new Random();
      boolean einsOderDrei = r.nextBoolean(); // erstes Zeichen der Adr.
      System.out.println(einsOderDrei);
//      if (einsOderDrei) {
//        bitCoin = bitCoin + "1";
//      } else {
//        bitCoin = bitCoin + "3";
//      }

      int erstesZeichen = r.nextInt(2); // erstes Zeichen der Adr.
      System.out.println(erstesZeichen);
      if (erstesZeichen == 0) {
        bitCoin = bitCoin + "1";
      } else {
        bitCoin = bitCoin + "3";
      }

//      Zahl in Zeichen konvertieren und an BitCoin-String hängen
      int B = 66;
      char zeichen = (char) B;
      bitCoin += zeichen;
      System.out.println(bitCoin);

      int zufallsZahl = r.nextInt(26) + 65; // 65 bis 65+26=91 (91 ist exkl.)
//      Zufallszahl im Bereich von 65 bis 65+26 an den BitCoin-String anhängen
      System.out.println("============ Ende der Experimente ====================");

//      Erzeugung der zulässigen BitCoin-Adr.
      for (int i = 0; i < 34 - 1; i++) { // -1 wg. erstem Zeichen (1 od. 3)
//        zufallszahl erzeugen
//        Prüfung: befindet sie sich im zulässigen Bereich: a-z, A-Z,0-9 => besser 1-9 (somit muss 0 nicht herausgefiltert werden).
//        Prüfung: Ausnahmen herausfiltern: großes I, kleine L, gr. O , Ziffer 0 (, + und /)
//        zufallszahl in char wandeln und an bitCoin-String hängen
      }

//      Ausgabe gemäß Aufgabenstellung
//      1bcd-1234-atXq
//      Udoa-5sbs-24fs
//      …

    }
    {
      System.out.println("=====================================");
      Random r = new Random();
      int randomWert = 0;
      String bitCoin = "";
      boolean einsOderDrei = r.nextBoolean();
      if (einsOderDrei) {
        bitCoin = bitCoin + "1";
      } else {
        bitCoin = bitCoin + "3";
      }

      for (int i = 0; i < 39 - 1 /*-5*/;) {
        randomWert = r.nextInt(122 + 1);
        if (randomWert >= 49 && randomWert <= 57 || // Ziffern OHNE 48=0
            randomWert >= 65 && randomWert <= 72 || randomWert >= 74 && randomWert <= 78 // ohne 73=I und 79=O
            || randomWert >= 80 && randomWert <= 90 || // Großbuchstaben ohne I ohne O
            randomWert >= 97 && randomWert <= 107 || randomWert >= 109 && randomWert <= 122) { // Kleinbuchstaben ohne
                                                                                               // 108=l

          char zeichen = (char) randomWert;
          bitCoin += zeichen;

          i++;

        }

      }
      System.out.println(bitCoin);
//      System.out.print(bitCoin.substring(0, 4) + "-" + bitCoin.substring(5, 9) + "-" + bitCoin.substring(10, 14) + "\n"
//          + bitCoin.substring(15, 19) + "-" + bitCoin.substring(20, 24) + "-" + bitCoin.substring(25, 29) + "\n"
//          + bitCoin.substring(30, 34) + "-" + bitCoin.substring(35, 39) + "-" + bitCoin.substring(36, 38));
    }
    {
      System.out.println("======================================");
      Random random = new Random();
      final String allowedLetter = "123456789abcdefghijkmnopqrstuvwxyzABCDEFGHJKLMNPQRSTUVWXYZ"; // ohne 0

      String bitcoinNumber;
      int startRandomInt = random.nextInt(10);

      if (startRandomInt <= 4) { // 50:50-Chance => 0-4 für 1 und 5-9 für 3
        bitcoinNumber = "1";
      } else {
        bitcoinNumber = "3";
      }

      final int BITCOIN_MINIMUM = 27;
      final int BITCOIN_MAXIMUM = 34;
      int bitcoinLength = random.nextInt(BITCOIN_MAXIMUM - BITCOIN_MINIMUM + 1) + BITCOIN_MINIMUM; // erzeugen Zahl zw.
                                                                                                   // min. und max.

      for (int i = 2; i <= bitcoinLength; i++) {
        int poolLetterIndex = random.nextInt(allowedLetter.length());
        bitcoinNumber += allowedLetter.charAt(poolLetterIndex); // bitcoinNumber enthält Zeichen

        if (i % 4 == 0 && i != bitcoinLength) {
          bitcoinNumber += "-";
        }
      }

      System.out.println(bitcoinNumber);
//      System.out.println(bitcoinNumber.length());
    }
    {
      System.out.println("======================================");
      Random r = new Random();
      char[] adresse = new char[34];

      for (int i = 0; i < adresse.length; i++) {
        int temp = 0;
        // (i>0)nach erster Stelle nachfolgende Zeichen
        if (i > 0) { // 1. Zeichen soll 1 oder 3 sein. Deshalb Sprung bei Array-Index 0 zu else
          int x = r.nextInt(3);

          switch (x) {
          case 0:
            temp = r.nextInt(26) + 97; // Kleinbuchstaben
            break;
          case 1:
            temp = r.nextInt(26) + 65; // Großb.
            break;
          case 2:
            temp = r.nextInt(9) + 49;// Ziffern ohne 0
            break;
          }
        } else {// erste Stelle 1 oder 3
          int a = r.nextInt(2); // Zufallszahl 1 oder 0 exkl. Grenze: 2
          temp = a == 0 ? 49 : 51; // int für char => a=0 dann 1 sonst 3
        }

        // Zeichen die nicht enthalten sein dürfen?
        if (temp != 111 && temp != 108 && temp != 105 && temp != 79) { // Ausschlüsse
          adresse[i] = (char) temp; // aus int char machen und in Array-Element schreiben
        } else {
          // zurücksetzen des Zählers, wenn falsche Zeichen
          i = i - 1;
        }

      }

      // Ausgabe der Adresse
      System.out.println("Bitcoin-Adresse:");
      for (int i = 0; i < adresse.length; i++) {
        if (i % 4 == 0 && i != 0 && i % (4 * 3) != 0) // drei Viererpäckchen pro Zeile
//          if (i % 3 == 0 && i != 0 && i % 9 != 0) // Dreierpäckchen
        {
          // Trennzeichen für 3 Zeichen
          System.out.print("-");
        }
        if (i != 0 && i % (4 * 3) == 0) {
          // Zeilenumbruch nach 9 Zeichen
          System.out.println(/* "" */); // CRLF
        }
        System.out.print(adresse[i]); // Zeichen nebeneinander ausgeben
      }
//      Mit vierer-Päckchen:
//      Bitcoin-Adresse:
//        1W39-NrQe-qzHQ 
//        nxvF-ZVxA-9Le5 
//        ZNZt-5536-PB

//      mit Dreier-Päckchen
//      Bitcoin-Adresse:
//        15P-e6Q-Haq
//        Bhg-Y95-key
//        H2U-Lbz-qv4
//        1zr-K3n-I
    }
    {
      System.out.println("\n======================================");
      String bitCode = "";
      int codeLeng = 0;
      boolean codeStart;
      String codChar = new String("123456789abcdefghjkmnopqrstuvwxyZABCDEFGHJKLMNPQRSTUVWXYZ!§$%&?-*<>");

      Random rando = new Random();

      codeLeng = rando.nextInt(7) + 27; // Schlüssellänge ist zw. 27 und 34 Zeichen lang
      codeStart = rando.nextBoolean(); /* Start 1 oder 3 offen */
      if (codeStart) {

        bitCode = "1";
      } else {

        bitCode = "3";
      }

      for (int i = 1; i <= codeLeng - 1; i++) {

        bitCode = bitCode + (codChar.charAt(rando.nextInt(codChar.length()))); // rando.nextInt(codChar.length()) =>
                                                                               // Zufallszahl für Beispielstring holen.
                                                                               // Dann in Zeichen von der Stelle im
                                                                               // String holen und an Ergebnis-String
                                                                               // hängen.

      }
//      Jetzt Ausgabe:
      for (int i = 0; i < bitCode.length(); i++) {

        System.out.print(bitCode.charAt(i));
        if (i % 4 == 0 && i % 12 == 0 && i != 0) { // Pos. prüfen für Zeilenumbruch: wenn ohne Rest durch 4 teilbar (am
                                                   // Ende eines 4er-Päckchens) UND am Ende der Zeile befinden (%12) und
                                                   // uns nicht am Anfang (i!=0) befinden, dann CRLF schicken.
          System.out.println(/* "" */); // CRLF
        } else if (i % 4 == 0 && i % 12 != 0 && i != codeLeng - 1) { // i != codeLeng-1 um Bindestrich zu unterdrücken,
                                                                     // wenn Ende des Schlüssels erreicht und gerade
                                                                     // 4er-Päckchen abgeschlossen wurde.
          System.out.print("-"); // optische Trennung de 4er-Blocks.
        }

      }

    }
    {
      System.out.println("\n======================================");
      // method

      Random r = new Random();

      // random first character "start" 1 or 3

      int randomFirstLetter = r.nextInt(2);
      String firstLetter = "";
      if (randomFirstLetter == 0) {
        firstLetter = "1";
      } else {
        firstLetter = "3";
      }

      // random length 26 - 33 characters => weil erstes Zeichen ja schon besteht

      int length = r.nextInt(8) /* Ziffern von 0 bis 7 */ + 26; // 26 bis 26+7 => Länge des Schlüssels im Bereich von 27
                                                                // bis 34 (inkl. erstem Zeichen)

      // generate address

      int randomChar = 0;
      String prelimStr = "";
      String tempString = "";

      char tempChar = '1';

      for (int charachter = 0; charachter < length;) { // keine Update-Zone
        randomChar = r.nextInt(122 + 1);
        if (randomChar >= 49 && randomChar <= 57 || // zulässige Zeichen
            randomChar >= 65 && randomChar <= 72 || randomChar >= 74 && randomChar <= 78
            || randomChar >= 80 && randomChar <= 90 || randomChar >= 97 && randomChar <= 107 || randomChar >= 109) {

          tempChar = (char) randomChar; // int zu char
          tempString = Character.toString(tempChar); // char zu String und anhängen

          prelimStr = prelimStr + tempString; // Schlüssel wachsen lassen
          charachter++; // bedingtes Inkrement
        }
      }

      // final address

//      String address = "";
//      address = firstLetter + prelimStr;

      String address = firstLetter + prelimStr;

      System.out.println(address);

      // format

      String format = "";
      int i = 0;
      int corlength = address.length() - (address.length() % 4);

      String permaFormat = "";

      while (i < corlength - 4) {
        format = address.substring(i, i + 4);
        permaFormat = permaFormat + format + "-";
        i += 4;
      }

      if (address.length() % 4 == 0) {
        permaFormat = permaFormat + address.substring(corlength - 4);
      } else {
        permaFormat = permaFormat + address.substring(corlength - 4, (address.length() - (address.length() % 4))) + "-"
            + address.substring(address.length() - (address.length() % 4));
      }

      System.out.println(permaFormat);

      int numberOfBlocks = 0;

      if (address.length() % 4 == 0) {
        numberOfBlocks = address.length() / 4;
      } else {
        numberOfBlocks = address.length() / 4 + 1;
      }

      String[] blocks = permaFormat.split("-");

      for (int x = 0; x <= 3; x = x + 3) {
        System.out.println(blocks[x] + "-" + blocks[x + 1] + "-" + blocks[x + 2]);
      }
      switch (numberOfBlocks) {
      case 7:
        System.out.println(blocks[6]);
        break;
      case 8:
        System.out.println(blocks[6] + "-" + blocks[7]);
        break;
      case 9:
        System.out.println(blocks[6] + "-" + blocks[7] + "-" + blocks[8]);
        break;
      default:
        System.out.println("");
      }

    }
    
    {
   // BEGIN Version 1
      {
        System.out.println("~~~~~~ Salvadors Versioin 1 ~~~~~~~");
        Random random = new Random();
        final int KEY_LANG = 27 + random.nextInt(7); // Schlüssel-Länge darf von 27 bis 34 gehen
//        @formatter:off
        int[][] chIndex = { 
            { 49, 57 }, // Ziffern
            { 65, 90 },  // Großbuchst.
            { 97, 122 }  // Kleinbuchst.
            };
//        @formatter:on

        String my_BitCoin;
        if (random.nextBoolean()) {
          my_BitCoin = "1";
        } else {
          my_BitCoin = "3";
        }

        for (int i = 1; i < KEY_LANG; i++) {
          int rd3 = random.nextInt(3); // 0, 1 od. 2 für Zif., Gr. od. Kl. Buchst.
          int z0 = chIndex[rd3][0]; // für z. B. Zeile 0 die Spalte 0 holen => Start-Pos. für Ziffern-Bereich 
          int z1 = chIndex[rd3][1]; // für z. B. Zeile 0 die Spalte 1 holen => End-Pos. für Ziffern-Bereich
          
          char ch = (char)(z0+random.nextInt(z1-z0)); // z. B. z1-z0: 49 bis 57 dann Anfangsgrenze add. => z1=49+Zufall=0 => 49+(0..8)
          if (ch!=73 && ch!= 79 && ch != 108) { // ohne gr. I, kl. L und gr. O
            if (i % 4 == 0) my_BitCoin +="-";
            my_BitCoin += ch;
          } else {
            --i;
          }
        }
        System.out.println("(" + KEY_LANG + ")" + "BitcoinKey: \n" + my_BitCoin);
      }
      //  END Version 1
      
      //  BEGIN Version 2
      System.out.println("~~~~~~ Salvadors Versioin 2 ~~~~~~~");
//      Die folgenden Zeilen erzeugen den String mit den zulässigen Zeichen
//      final String allowedLetter = "123456789abcdefghijkmnopqrstuvwxyzABCDEFGHJKLMNPQRSTUVWXYZ";
      Random random = new Random();
      String strALL_chars = "";
      int[][] chIndex = { { 49, 57 }, { 65, 90 }, { 97, 122 } };

      for (int i = 0; i < chIndex.length; i++) {
        String str = ""; // String mit möglichen Zeichen einer Gruppe

        for (int idx = chIndex[i][0]; idx <= chIndex[i][1]; idx++) { // inner Loop: von bis
          str += (char) idx; // nacheinander durchlaufen der 3 Gruppen (1-9A-Za-z)
        }
        strALL_chars += str; // Gesamt-String mit allen Zeichen einer Gruppe
      }
      strALL_chars = strALL_chars.replace("l", ""); // entfernen der unerlaubten Zeichen
      strALL_chars = strALL_chars.replace("I", ""); // nicht als ASCII
      strALL_chars = strALL_chars.replace("O", ""); // sondern klar lesbar

//      und jetzt den zufälligen Schlüssel erzeugen
      final int LANG = strALL_chars.length();
      String my_BitCoin;
      if (random.nextBoolean()) {
        my_BitCoin = "1";
      } else {
        my_BitCoin = "3";
      }
      final int KEY_LANG = 27 + random.nextInt(7);

      for (int k = 1; k < KEY_LANG ; k++) { // über zufällige Länge (27 bis 34 Zeichen) iterieren
        char ch = strALL_chars.charAt(random.nextInt(LANG)); // Zeichen an der zufälligen Stelle im MusterString holen
        String str_dot = k != KEY_LANG && k % 4 == 0 ? k % 12 == 0 ? "\n" : "-" : "";  // Trennzeichen alle 4 Pos. einfügen
        my_BitCoin += str_dot + ch; // String zusammenbauen ("wachsen" lassen)
      }
      System.out.println("(" + KEY_LANG + ")" + "BitcoinKey: \n" + my_BitCoin); // Ausgabe
    }
    //  END Version2
    {
      System.out.println("=================================");
      Random r = new Random();
      int randomWert = 0;
      String bitCoin = "";
      
      boolean einsOderDrei = r.nextBoolean();
      if (einsOderDrei) {
        bitCoin = bitCoin + "1";
      } else {
        bitCoin = bitCoin + "3";
      }

      for (int i = 1; i <= 34 -1 ;) {
        randomWert = r.nextInt(122 + 1);
        if (randomWert >= 49 && randomWert <= 57 ||                          // Ziffern OHNE 0
            randomWert >= 65 && randomWert <= 72 || randomWert >= 74 && randomWert <= 78 || 
            randomWert >= 80 && randomWert <= 90 ||                       // Großbuchstaben ohne I ohne O
            randomWert >= 97 && randomWert <= 107 || randomWert >= 109 && randomWert <= 122) {  // Kleinbuchstaben ohne l
                                                      
          char zeichen = (char) randomWert;
          bitCoin += zeichen;
          i++;
          if(i>0 && i%4==0 && i !=34 && i%12 !=0 ) {
            bitCoin += "-";
          }
          if(i>0 && i%12==0 && i !=34) {
            bitCoin += "\n";
        }
      }
        
        
      }
      System.out.print(bitCoin);
    }
  } // end of main
}
