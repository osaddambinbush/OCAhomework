package _07_02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Teilnehmer implements Serializable {
	public static File a = new File("C://IO/export/Teilnehmer.txt");
	public static File b = new File("c://IO/export/");
	public static List<String> tn = new ArrayList<>();
	
	
	public static Teilnehmer add(String name) {
		
		try {
			b.mkdirs();
			a.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tn.add(name);
		return new Teilnehmer();
	}
	
	
	public static void export() {

		try (PrintWriter pw = new PrintWriter(a)) {
			for (String t : Teilnehmer.tn) {
				pw.write(t);
				pw.write("\r\n");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (BufferedReader br = new BufferedReader(new FileReader(a))) {
			String readLine;
			while ((readLine = br.readLine()) != null) {
				System.out.println(readLine);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
