package project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class JavaSearch implements Serializable{
	
	private static final long serialVersionUID = 1L;
	static ArrayList<File> dataPool = new ArrayList<>();
	static int counter = 1;


public static void main(String[] args)throws Exception {
		 JavaSearch obj = new JavaSearch();
		 
		 speichern(obj, "d:\\ObjektZustand.serialisierung");
		 obj=(JavaSearch) laden("d:\\ObjektZustand.serialisierung");

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
					System.out.println(counter + " - "+element);
					counter++;
				}
			}
		}
	}
	  static void speichern(Object obj, String dateiName) throws Exception {
		    FileOutputStream fos = new FileOutputStream(dateiName); 
		    ObjectOutputStream os = new ObjectOutputStream(fos); 
		    os.writeObject(obj); 
		    os.close();
		  }
		  
		  static Object laden (String dateiName) throws Exception {
		    FileInputStream fis = new FileInputStream(dateiName); 
		    ObjectInputStream is = new ObjectInputStream(fis); 
		    Object o = is.readObject(); 
		    is.close();
		    return o; 
		  }
}