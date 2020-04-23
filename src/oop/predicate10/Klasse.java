package oop.predicate10;

import java.util.*;


public class Klasse {
  public static void main(String[] args) {
    ArrayList<String> bunnies = new ArrayList<String>();
    bunnies.add("long ear");
    bunnies.add("floppy");
    bunnies.add("hoppy");
    bunnies.add("happy");
    bunnies.add("hippy");
    System.out.println("Alle Hasen: "+bunnies);
    bunnies.removeIf(b -> b.startsWith("h"));
    System.out.println("Alle Hasen: "+bunnies);
    } // end of class
    
}

