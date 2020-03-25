package uebungen;

import java.util.ArrayList;
import java.util.Collections;

public class AlInt {

	public static void main(String[] args) {

		ArrayList<String> birds = new ArrayList<String>();

		birds.add("Quetzal"); 
		birds.add("Quetzal");
		birds.add("Tucan");
		birds.add("Quetzal");
		birds.add("Quetzal");
		if (birds.size() > 0) {
			birds.removeAll(Collections.singleton("Quetzal")); // OCP
			System.out.println(birds);

		}

	}
}