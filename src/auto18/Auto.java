package auto18;
public class Auto {
  private int geschwindigkeit; private String name;  // Zugriff von Kind OK, wenn members sichtbar sind (hier wg. private nicht sichtbar)
//  @formatter:off
  void beschleunigung()   {geschwindigkeit++;}
  void bremsen() {if (geschwindigkeit > 0) geschwindigkeit--;}  
  Auto(String name){this.name=name;} Auto(){} // Konstr. werden nicht vererbt.
  public int getGeschwindigkeit()     {return geschwindigkeit;}
  public void setName(String autoName) {name = autoName;}
  public String getName() {return name;}
  public String toString() {
	 
	  return "Das Auto mit dem Namen '" + name + "' fährt " + geschwindigkeit + " km/h." ;} 
} // EndOfClass
class Cabrio extends Auto{ // Kind ist spezieller
  Cabrio (String name){this.setName(name);} // Übung: Bitte ermöglichen Sie, dass bei Erzeugung eines Cabrio-Obj. die Var. name von Auto verwendet wird.
  // Cabrio (String name){setName(name);}  geht auch

  
  boolean dachOffen;
  public void oeffneDach() {
	  if(dachOffen) {System.out.println("Dach ist bereits geöffnet");}else {
	  dachOffen= true;
	 }
  }
  public void schließeDach() {
	  if(!dachOffen) {System.out.println("Dach ist bereits geschlossen");}else {
	  dachOffen= false;
	  }
  }
public String toString() {
	
	if(dachOffen) {
	String isOpen = "und das Dach ist geöffnet.";
	return  "Das Auto mit dem Namen '" + getName() + "' fährt " + getGeschwindigkeit() + " km/h " + isOpen; }
	else 
	{
		String isOpen= "und das Dach ist geschlossen.";
		return  "Das Auto mit dem Namen '" + getName() + "' fährt " + getGeschwindigkeit() + " km/h " + isOpen;
	}
	}

	
	 
}



class AutoBauen{
  public static void main(String[] args) {
    Cabrio c1 = new Cabrio("Cabrio");
    Auto a1 = new Auto("Auto");
    c1.oeffneDach();
    c1.schließeDach();
	System.out.println(c1);
	System.out.println(a1);
    
 
    
  }
  
}