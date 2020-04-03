package oop.auto20;

public class Auto  {
  private int geschwindigkeit=100; private String name; 
//  @formatter:off
  void bremsen() {if (geschwindigkeit > 0) geschwindigkeit--;}
  
//  Bitte schreiben Sie die Methode anhalten(), die das Auto abbremst, bis es zum Stillstand gekommen ist.
  void anhalten(){for(; geschwindigkeit>0;bremsen()); }
  
  
  Auto(String name){this.name=name;} Auto(){}
  public String toString() {return name + " fährt " + geschwindigkeit + " km/h.";} 
} // EndOfClass

class AutoBauen{
  public static void main(String[] args) {
    Auto auto1 = new Auto("FastCar");
    System.out.println(auto1);
    auto1.anhalten();
    System.out.println(auto1);
  }
  
}