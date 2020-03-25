package ueb;

import java.util.ArrayList;
import java.util.Collections;

public class AlInt {

	public static void main(String[] args) {

		ArrayList<String> birds = new ArrayList<String>();

		birds.add("hawk"); // Falke
		birds.add("hawk");
		birds.add("robin");
		birds.add("hawk");
		birds.add("hawk");
		if (birds.size() > 0) {
			birds.removeAll(Collections.singleton("hawk")); // OCP
			System.out.println(birds);

		}

	}
}