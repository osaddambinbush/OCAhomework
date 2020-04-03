package oop.Auto22;

public class Auto {
	
	private String name; private int hup; // Instanzvariablen

	 Auto(String name){this.name=name;} Auto(){}
	  public String toString() {return name + " hupt " +hup  + " mal.";} 
	
	  public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getHup() {
			
			return hup;
		}
		public void setHup(int hup) {
			
			this.hup = hup;
		}
	  
	  
	  
	  public static void main(String[] args) {
		
		  Auto a1 = new Auto("Bert");
		  a1.setHup(40);
		  System.out.println(a1);
	
		
	
		
	}

}
