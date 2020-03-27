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
			birds.removeAll(Collections.singleton("Quetzal"));
			System.out.println(birds);

		}
		{
			ArrayList<Integer> al1 = new ArrayList<Integer>();
			al1.add(1);
			al1.add(2);
			al1.add(3);
			al1.add(4);
			
			
			
			ArrayList<Integer> al2 = new ArrayList<Integer>();
			al2.add(2);
			al2.add(3);
			
			al1.removeAll(al2);
			System.out.println(al1);
			
			System.out.println(al1.contains(al2));
				
			
		}

	}
}