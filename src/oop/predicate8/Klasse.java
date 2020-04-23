package oop.predicate8;

    
//    Bitte geben Sie alle Elemente aus, die mit einem "M" beginnen und einem "a" enden.
//    Verwenden Sie dazu eine Methode, die dies über ein Predicate ermöglicht (oop.predicate7a;).
    import java.util.function.Predicate;

    public class Klasse {
      public static void main(String[] args) {

        String[] sArr = { "Ruth", "Hans", "Marie", "Martina", "HansWurst" };

        printFilter(sArr, str -> str.startsWith("M") & str.endsWith("a"));

      } // end of main

      static void printFilter (String[] liste, Predicate<String> bedingung) {
        for (String element : liste) {
          if (bedingung.test(element)) {
            System.out.println("'" + element + "'" + " Startet mit 'M' und endet mit 'a'");
          }
        }
      } // end of printFilter
    } // end of class

    //'Hans' enthält 'Hans'
    //'HansWurst' enthält 'Hans'
    
  

