
package _08_13;

import java.util.concurrent.ArrayBlockingQueue;

public class Pizza {
	public static void main(String[] args) {
		Management orders = new Management();
		final int max_Orders = 50;

		Thread aliceThread = new Thread(() -> {
			for (int i = 1; i <= max_Orders; i++) {
				System.out.println("Bestellung Nr.: " + i + " wird dem Koch übergeben.");
				orders.order(i);
				
			}
		}, "alice");

		Thread bobThread = new Thread(() -> {

			while (true) {
				int nr = orders.cook();
				System.out.println("Bestellung Nr.: " + nr + "wurde fertig gekocht");
			}

		}, "bob");

		aliceThread.start();
		bobThread.start();

	}
}

class Management {
	ArrayBlockingQueue<Integer> orderNr = new ArrayBlockingQueue<>(5);

	public void order(int nr) {
		try {
			orderNr.put(nr);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

	public int cook() {
		int nr = 0;
		try {
			nr = orderNr.take();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		return nr;
	}

}
