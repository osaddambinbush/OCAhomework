package project;

import java.io.File;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class JavaSearch {
	static ArrayList<File> dataPool = new ArrayList<>();

	public static void main(String[] args) {

		File f = new File("C:\\Java\\CC_244132\\java");
		listDir(f);
		search();

	}

	static void listDir(File dir) {
		File[] fileArray = dir.listFiles();
		if (fileArray != null) {
			for (File element : fileArray) {
				if (element.isDirectory()) {
					listDir(element);
				} else {

					dataPool.add(element);

				}
			}
		}

	}

	static void search() {
		String s = JOptionPane.showInputDialog(null, "tipp ma ein watt du suchst: ", "Java-Projekt - Suchfunktion ",
				JOptionPane.PLAIN_MESSAGE);
		if (dataPool != null && s != null) {
			for (File element : dataPool) {
				if (element.getName().contains(s) && element.toString().endsWith(".java")) {
					System.out.println(element);
				}
			}
		}
	}
}