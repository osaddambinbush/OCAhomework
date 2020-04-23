package oop.predicate4;

import java.util.*;
import java.util.function.*;

public class Klasse {
	public static void main(String[] args) {
		Arrays.asList(8, 9, 7, 2, 3, 10, 7);
		List<Integer> numList = Arrays.asList(8, 9, 7, 2, 3, 10, 7);
//    for ( Integer zahl: numList) System.out.println(zahl);

//  Bitte nur die Zahlen ausgeben, die größer als 5 sind. Bitte mit Lambda und Predicate realisieren.
		Predicate<Integer> o = p -> p > 5;
		for (Integer n : numList) {
			if (o.test(n) == true) {
				System.out.println(n);
			}

		}

	}
}
