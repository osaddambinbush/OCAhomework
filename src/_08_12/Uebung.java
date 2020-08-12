package _08_12;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 
 * Kurze Blick auf ReadWriteLock, CopyOnWriteArrayList
 * 
 * 
 * 
 * Alice und Bob:
 * 
 * -Shared Object: Eine Liste von Zehlen
 * 
 * Alice f�gt Elemente in die Liste (beliebig viele), mit dazwischen Pause
 * 
 * Bob Liste traversieren, mit dazwischen Pause
 * 
 *
 */

public class Uebung {

	static List<Integer> sharedList = new CopyOnWriteArrayList<>();

	public static void show() {
		Iterator<Integer> it = sharedList.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}

		}
		System.out.println("The End");
	}

	public static void main(String[] args) {

		new Thread("alice") {
			@Override
			public void run() {
				int i;
				for (i = 60; i >= 1; i--) {

					sharedList.add(i);

				}

			}
		}.start();

		new Thread("bob") {
			@Override
			public void run() {
				show();
				try {
					Thread.sleep(1000);
				} catch (Exception e) {

				}

			}
		}.start();

	}

}
