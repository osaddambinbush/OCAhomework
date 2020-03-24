package ueb;

import java.util.ArrayList;

public class ArrayListUeb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> liste = new ArrayList<String>();
		liste.add(null);
		liste.add(0, "Hallo");
		liste.add(" Welt");
		for(int i=0; i<liste.size(); i++) {
			if(liste.get(i)== null) continue;
			System.out.println(liste.get(i));
		}
		
		
	}

}
