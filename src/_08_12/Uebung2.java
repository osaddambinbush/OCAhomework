package _08_12;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Uebung2 {
	static List<Integer> sharedList = new CopyOnWriteArrayList<>();
	static int sleep = 1000;
 
	public static void show() {
		Iterator<Integer> it = sharedList.iterator();
 
		while (it.hasNext()) {
			System.out.println(it.next() + "   Time is running out my friend... : " + sleep+ " ms");// CME
			sleep -= sleep>=25?  25 :0;
 
			try {
				Thread.sleep(sleep);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("The End");
		System.out.println(sharedList);
	}
 
	public static void main(String[] args) {
 
		new Thread("alice") {
			@Override
			public void run() {
				for (int i = 60; i >= 0; i--) {
					sharedList.add(i);
				}
			}
		}.start();
 
		new Thread("bob") {
			@Override
			public void run() {
				show();
				try {
					Thread.sleep(sleep);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}.start();
	}
}
