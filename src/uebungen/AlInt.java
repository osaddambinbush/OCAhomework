package uebungen;

import java.util.ArrayList;
import java.util.Collections;

public class AlInt {

	public static void main(String[] args) {

		ArrayList<String> birds = new ArrayList<String>();

		birds.add("Quetzal"+ " Hallo hab removeAll ausgespielt :D"); 
		birds.add("Quetzal");
		birds.add("Tucan");
		birds.add("Quetzal");
		birds.add("Quetzal");
		birds.add(null);
		birds.add("");
		birds.add(new String("Phoenix"));
		
		
		birds.removeAll(Collections.singleton("Quetzal"));
		System.out.println(birds);
		
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
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(10);
			list.add(14);
			for(int x : list) System.out.println(x + ", ");
				
			
		}

	}
}