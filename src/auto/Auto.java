package auto;

public class Auto {
	private int geschwindigkeit;
	private String name;

	Auto(){
		this("NoName");
	}
	
	Auto(String name) {
		 this(name, 0);
	}
	
    Auto(int geschwindigkeit) {
		this("NoName ", geschwindigkeit);
	}
    Auto(String name, int geschwindigkeit){
    	this.geschwindigkeit=geschwindigkeit;
    	this.name = name;
    }
	
	public void beschleunigen() {
		geschwindigkeit++;
	}

	public void bremsen() {
		geschwindigkeit--;
	}


	public String getStatus() {
		return "Das Auto mit dem Namen "+ name + " fährt " + geschwindigkeit + " km/h.";
		
	}
	

}

class AutosBauen {

	public static void main(String[] args) {
		Auto auto1 = new Auto("FastCar");
		
		
		auto1.beschleunigen();
		auto1.beschleunigen();
		System.out.println(auto1.getStatus());
		
	}
}
