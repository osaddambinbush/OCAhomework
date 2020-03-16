package ueb;

import java.util.Random;

public class WlanKeyShort {

  public static void main(String[] args) {
    {
      System.out.println("\n========= short =============");
      Random r1 = new Random();
      int randomWert = 0;

      for (int ctr = 0; ctr < 64;) {
        randomWert = r1.nextInt(122 + 1);
        // Mit Hilfe der ASCII-Tabelle auf gültige Werte prüfen
        if (randomWert >= 48 && randomWert <= 57 || // Ziffern
            randomWert >= 65 && randomWert <= 90 || // Großbuchstaben
            randomWert >= 97) {// Kleinbuchstaben
//        randomWert >= 97 && randomWert <= 122) {// Kleinbuchstaben
          System.out.print((char) randomWert);
          ctr++;
        }
      }
    }
    {
//    Übung: 
//    Bitte erweitern Sie die obige Lösung.
//    Trennen Sie bitte jeweils 4 Zeichen durch einen Punkt.
//    z. B.: Scb3.2g0E.C13m86VfAaL78x6ihryAk9tS053rEKMQpFFbzaNeTnTeA5J1Yhv6Snsq
      System.out.println("\n========= mit Trennungspunkt =============");
      Random r1 = new Random();
      int randomWert = 0;

      for (int ctr = 1; ctr <= 64;) { // 1 wg. korrekter Punktausgabe
        randomWert = r1.nextInt(122 + 1);
        // Mit Hilfe der ASCII-Tabelle auf gültige Werte prüfen
        if (randomWert >= 48 && randomWert <= 57 || // Ziffern
            randomWert >= 65 && randomWert <= 90 || // Großbuchstaben
            randomWert >= 97) {// Kleinbuchstaben
//        randomWert >= 97 && randomWert <= 122) {// Kleinbuchstaben
          System.out.print((char) randomWert);
          String _dot = ctr > 0 && ctr % 4 == 0 ? "." : "";
          System.out.print(_dot);
          ctr++;
        }
      }
//      z. B.: tCSE.2akt.DMiD.dmv0.Pc44.kUNx.IRNj.lMfb.rRYt.BJa4.dyUN.rzvf.Ujti.1Htx.05FZ.mnGC. => Achtung: letzter Punkt
    }
    {
//    Übung: 
//    Bitte erweitern Sie die obige Lösung.
//    Trennen Sie bitte jeweils 4 Zeichen durch einen Punkt.
//    z. B.: Scb3.2g0E.C13m86VfAaL78x6ihryAk9tS053rEKMQpFFbzaNeTnTeA5J1Yhv6Snsq
      System.out.println("\n========= ohne letztem Punkt =============");
      Random r1 = new Random();
      int randomWert = 0;

      for (int ctr = 1; ctr <= 64;) { // 1 wg. korrekter Punktausgabe
        randomWert = r1.nextInt(122 + 1);
        // Mit Hilfe der ASCII-Tabelle auf gültige Werte prüfen
        if (randomWert >= 48 && randomWert <= 57 || // Ziffern
            randomWert >= 65 && randomWert <= 90 || // Großbuchstaben
            randomWert >= 97) {// Kleinbuchstaben
//        randomWert >= 97 && randomWert <= 122) {// Kleinbuchstaben
          System.out.print((char) randomWert);
          String _dot = ctr > 0 && ctr % 4 == 0  && ctr != 64 ? "." : "";
          System.out.print(_dot);
          ctr++;
        }
      }
//    z. B.:   MG5v.qswg.chk2.hrAX.TIXZ.L9or.qWsz.iU2o.7oPh.KowD.WVKG.zudd.iPOm.pr5F.08Ti.D2at
    }
    {
//    Übung: 
//    Bitte erweitern Sie die obige Lösung.
//    Trennen Sie bitte jeweils 4 Zeichen durch einen Punkt.
//    z. B.: Scb3.2g0E.C13m86VfAaL78x6ihryAk9tS053rEKMQpFFbzaNeTnTeA5J1Yhv6Snsq
      System.out.println("\n========= very short =============");
      Random r1 = new Random();
      int randomWert = 0;

      for (int ctr = 1; ctr <= 64;      ) { // 1 wg. korrekter Punktausgabe
        randomWert = r1.nextInt(122 + 1);
        // Mit Hilfe der ASCII-Tabelle auf gültige Werte prüfen
        if (randomWert >= 48 && randomWert <= 57 || // Ziffern
            randomWert >= 65 && randomWert <= 90 || // Großbuchstaben
            randomWert >= 97) {// Kleinbuchstaben
          System.out.print( ctr % 4 ==0 & ctr != 0 & ctr != 64 ? (char) randomWert + "." : (char)randomWert );
          ctr++; // bedingtes Inkrementieren, um Schlüssellänge von 64 Zeichen zu garantieren.
        }
      }
//    z. B.:   MG5v.qswg.chk2.hrAX.TIXZ.L9or.qWsz.iU2o.7oPh.KowD.WVKG.zudd.iPOm.pr5F.08Ti.D2at
    }
    {
//    Übung: 
//    Bitte erweitern Sie die obige Lösung.
//    Trennen Sie bitte jeweils 4 Zeichen durch einen Punkt.
//    z. B.: Scb3.2g0E.C13m86VfAaL78x6ihryAk9tS053rEKMQpFFbzaNeTnTeA5J1Yhv6Snsq
      System.out.println("\n========= unbedingtes Inkrementieren =============");
      Random r1 = new Random();
      int randomWert = 0;

      for (int ctr = 1; ctr <= 64; ctr++     ) { // 1 wg. korrekter Punktausgabe
        randomWert = r1.nextInt(122 + 1);
        // Mit Hilfe der ASCII-Tabelle auf gültige Werte prüfen
        if (randomWert >= 48 && randomWert <= 57 || // Ziffern
            randomWert >= 65 && randomWert <= 90 || // Großbuchstaben
            randomWert >= 97) {// Kleinbuchstaben
          System.out.print( ctr % 4 ==0 & ctr != 0 & ctr != 64 ? (char) randomWert + "." : (char)randomWert );
//          ctr++; // bedingtes Inkrementieren, um Schlüssellänge von 64 Zeichen zu garantieren.
          }
        }
//    z. B.:   MG5v.qswg.chk2.hrAX.TIXZ.L9or.qWsz.iU2o.7oPh.KowD.WVKG.zudd.iPOm.pr5F.08Ti.D2at
//             2Hpk.fXo.k8F.8D2lWB.YOx.zve.VeXR.JlJCknp <= Lösung nicht gemäß Aufgabenstellung
      }
    {
//    Übung: 
//    Bitte erweitern Sie die obige Lösung.
//    Trennen Sie bitte jeweils 4 Zeichen durch einen Punkt.
//    z. B.: Scb3.2g0E.C13m86VfAaL78x6ihryAk9tS053rEKMQpFFbzaNeTnTeA5J1Yhv6Snsq
      System.out.println("\n========= Korrektur des unbedingtem Inkrementierens =============");
      Random r1 = new Random();
      int randomWert = 0;

      for (int ctr = 1; ctr <= 64; ctr++     ) { // 1 wg. korrekter Punktausgabe
        randomWert = r1.nextInt(122 + 1);
        // Mit Hilfe der ASCII-Tabelle auf gültige Werte prüfen
        if (randomWert >= 48 && randomWert <= 57 || // Ziffern
            randomWert >= 65 && randomWert <= 90 || // Großbuchstaben
            randomWert >= 97) {// Kleinbuchstaben
          System.out.print( ctr % 4 ==0 & ctr != 0 & ctr != 64 ? (char) randomWert + "." : (char)randomWert );
//          ctr++; // bedingtes Inkrementieren, um Schlüssellänge von 64 Zeichen zu garantieren.
        }else {
          --ctr; // Korrektur wg. unbedingtem Inkrementieren
          }
        }
//    z. B.:   MG5v.qswg.chk2.hrAX.TIXZ.L9or.qWsz.iU2o.7oPh.KowD.WVKG.zudd.iPOm.pr5F.08Ti.D2at
//             RzOC.mKCR.uy5v.Nt8A.3Xz4.XfeR.51Pf.kv13.nqhk.kWgC.yVyo.4axh.m57s.r7Ar.RWP8.pr1w => OK wg. Korrektur
      }
    }
  }
