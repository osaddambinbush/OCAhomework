package project;

import java.io.File;
import java.util.ArrayList;
import java.util.function.Predicate;

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
		String dataType= ".java";
		String searchString = JOptionPane.showInputDialog(null, "tipp ma ein watt du suchst: ", "Java-Projekt - Suchfunktion ",
				JOptionPane.PLAIN_MESSAGE);
		if (dataPool != null && searchString != null) {
			for (File element : dataPool) {
				Predicate<String> filter = t -> element.getName().contains(searchString) && element.toString().endsWith(dataType);
				{
					if (filter.test(searchString))
						System.out.println(element);
				}
			}
		}
	}
}