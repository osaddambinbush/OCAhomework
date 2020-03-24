package ueb;

import java.util.ArrayList;
import java.util.Collections;

public class AlInt {

	public static void main(String[] args) {
//		ArrayList<Integer> listInt = new ArrayList<Integer>(99);
//		
//		for(int i=0;i<=99; i++) {
//			
//		listInt.add(i);
//		System.out.println(listInt);
	}

	{
		ArrayList<String> birds = new ArrayList<String>();

		birds.add("hawk");
		birds.add("hawk");
		birds.add("robin");
		birds.add("hawk");
		birds.add("hawk");

		if (birds.size() > 0) {

			birds.removeAll(Collections.singleton("hawk"));
			System.out.println(birds);

		}
	}

}
