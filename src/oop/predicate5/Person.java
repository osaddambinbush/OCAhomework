package oop.predicate5;

public class Person {
  String name;
  int alter;
  java.util.function.Predicate<Integer> o = p -> p >= 18;
  
  public Person(String name, int alter) {
    this.name=name;
    this.alter=alter;
  }
  
  public String toString() {
	  if(o.test(alter)) {
	 return name +" ist " + alter +" Jahre alt und ist volljährig. ";
  }else {return name +" ist " + alter +" Jahre alt und ist minderjährig. ";}}
  
 


		 
  
  public static void main(String[] args) {
    Person p1 = new Person("Marie", 40);
    Person p2 = new Person("Carsten", 10);
    
System.out.println(p1+ p2.toString());
 
  }
}
