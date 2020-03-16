package ueb;

import java.util.Random;

public class WlanKey {

  public static void main(String[] args) {
//    Bitte erstellen Sie einen exakt(!) 64 Byte langen zufälligen WLAN-Schlüssel für einen Router.
//    Nur die folgenden Zeichen sollen verwendet werden: a-z, 0-9, A-Z.
//    z. B.: azVr3pU...
//    Nur auf Monitor ausgeben (kein Array).
//    Tipp: new Random().nextInt()
    {
      String str_zahlen = "012345789";
      String str_lower = "abcdefghijklmnopqrstuvwxyz";
      String str_alle = str_lower + str_zahlen + str_lower.toUpperCase();
      int lang = str_alle.length();
      String my_schluessel = "";

      Random rand = new Random();
      int index;
      char ch;
      String st_dot;

      for (int j = 0; j < 64; j++) {
        index = rand.nextInt(lang);
        ch = str_alle.charAt(index);
        st_dot = j > 0 && j % 4 == 0 ? "\n" : "";
        my_schluessel += st_dot + ch;

      }
      System.out.println("Schlüssel: \n" + my_schluessel);

    }
    {
      final int KEY_LENGTH = 64;
      String key = "";

      for (int i = 0; i < KEY_LENGTH; i++) {
        int randomInt = getRandomInt(1, 3);

        switch (randomInt) {
        case 1:
          key += getRandomChar(65, 90);
          break;
        case 2:
          key += getRandomChar(97, 122);
          break;
        case 3:
          key += getRandomChar(48, 57);
          break;
        }
      }

      System.out.println(key);
      // System.out.println(key.length());
    }

    {
      Random r = new Random();
      char[] key = new char[64];

      for (int i = 0; i < key.length; i++) {
        int temp = 0;
        int x = r.nextInt(3);

        switch (x) {
        case 0:
          temp = r.nextInt(26) + 97;
          break;
        case 1:
          temp = r.nextInt(26) + 65;
          break;
        case 2:
          temp = r.nextInt(10) + 48;
          break;
        }
        key[i] = (char) temp;
      }
      System.out.println("Super Secret Password:");
      for (int i = 0; i < key.length; i++) {
        if (i % 4 == 0 & i != 0)
          System.out.print(" ");
        System.out.print(key[i]);
      }
    }
    {
      System.out.println("\n======================");
      int ascType = 0;
      int key;
      char keyAsc;
      int ascStartNum = 48;
      int ascLenNum = 10;
      int ascStartAlpL = 65;
      int ascLenAlpL = 26;
      int ascStartAlpU = 97;
      int ascLenAlpU = 26;
      int byteLen = 64;

      Random random = new Random();
      for (int i = 0; i < byteLen; i++) {
        ascType = random.nextInt(3);
        switch (ascType) {
        case 0:
          key = random.nextInt(ascLenNum) + ascStartNum;
          break;
        case 1:
          key = random.nextInt(ascLenAlpL) + ascStartAlpL;
          break;

        default:
          key = random.nextInt(ascLenAlpU) + ascStartAlpU;
        }
        keyAsc = (char) key;
        System.out.print(keyAsc);
      }
    }

    {
      System.out.println("\n======================");
      Random r1 = new Random();

      int randomWert;

      int[] intArray = new int[64];
      char[] charArray = new char[64];

      int ctr = 0;
      while (ctr < 64) {
        randomWert = r1.nextInt(130);
        // Mit Hilfe der ASCII-Tabelle auf gültige Werte prüfen
        if (randomWert >= 48 && randomWert <= 57 || (randomWert >= 65 && randomWert <= 90)
            || (randomWert >= 97 && randomWert <= 122)) {
          intArray[ctr] = randomWert; // Zuweisung eine gültigen Wertes
          ctr++;
        }
      }

      for (int i = 0; i < intArray.length; i++) {
        charArray[i] = (char) intArray[i]; // Umwandlung int --> char lt. ASCII-Tabelle
      }

      for (int element : intArray) {
        System.out.print(element + " ");
      }
      System.out.println();

      for (char element : charArray) {
        System.out.print(element + " ");
      }
    }
    System.out.println("\n========= short =============");
    Random r1 = new Random();
    int randomWert = 0;
    int ctr = 0;
    for (   ; ctr < 64;  )
      randomWert = r1.nextInt(130);
    // Mit Hilfe der ASCII-Tabelle auf gültige Werte prüfen
    System.out.println("drin");
    if (randomWert >= 48 && randomWert <= 57 || randomWert >= 65 && randomWert <= 90
        || randomWert >= 97 && randomWert <= 122) {
      System.out.print((char) randomWert);
      ctr++;
    }
  } // EndOfMain

  private static char getRandomChar(int asciiMinimum, int asciiMaximum) {
    return (char) getRandomInt(asciiMinimum, asciiMaximum);
  }

  private static int getRandomInt(int minimum, int maximum) {
    Random r = new Random();
    return r.nextInt(maximum - minimum + 1) + minimum;
  }
}
