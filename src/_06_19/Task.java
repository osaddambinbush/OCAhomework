package _06_19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.spi.DirectoryManager;

/**
 * 
 * File -Konstruktoren -createNewFile -...
 * 
 * Aufgabe 1: -Wie kann man ein Verzeichnis (Directory) erzeugen?
 * 
 * Erzeuge folgende Verzeichnisstruktur und Dateien:
 * 
 * Projektverzeichnis/ch05/IO/lowlevelAPI/readWrite/now.txt
 * Projektverzeichnis/ch05/IO/highlevelAPI/newLine/now.txt
 * Projektverzeichnis/ch05/IO/highlevelAPI/readLine/now.txt
 * Projektverzeichnis/ch05/IO/highlevelAPI/println/now.txt
 * 
 * Aufgabe 2: Lese die Dokumentation der Konstruktorn von den Readers und
 * Writers, die wir benutzt haben und von den Schreib- und Lesemethoden!
 * Wichtig! Exception, Return Wert! (Syntax und Semantik)
 * 
 *
 */
public class Task {

	private static void check(File f) {
		System.out.println("_____________________________________");
		System.out.println("Lesezufgriff = " + f.canRead());
		System.out.println("Schreibzugriff " + f.canWrite());
		System.out.println("Dateipfad: " + f.getAbsolutePath());
		System.out.println("Ist eine Datei: " + f.isFile());
		System.out.println("Ist ein Folder: " + f.isDirectory());
		
	}

	public static void main(String[] args) {
		File[] dA = new File[4];
		dA[0] = new File("IO/lowlevelAPI/readWrite/");
		dA[1] = new File("IO/highlevelAPI/newLine/");
		dA[2] = new File("IO/highlevelAPI/readLine/");
		dA[3] = new File("IO/highlevelAPI/println/");

		File[] fA = new File[4];
		fA[0] = new File("IO/lowlevelAPI/readWrite/now.txt");
		fA[1] = new File("IO/highlevelAPI/newLine/now.txt");
		fA[2] = new File("IO/highlevelAPI/readLine/now.txt");
		fA[3] = new File("IO/highlevelAPI/println/now.txt");
		check(fA[0]);

		try {
			for (int i = 0; i < dA.length - 1; i++) {
				dA[i].mkdirs();
				fA[i].createNewFile();

				try (PrintWriter pw = new PrintWriter(fA[i])) {
					pw.write("Hallo Welt");
					pw.append(" -");
					pw.append(" See you soon!");
				} catch (Exception e) {
					// TODO: handle exception
				}
				try (BufferedReader br = new BufferedReader(new FileReader(fA[i]))) {

					String lineRead;
					while ((lineRead = br.readLine()) != null) {
						System.out.println(lineRead);
					}

				} catch (Exception e) {
					System.out.println(e);
				}
				check(fA[i]); // DateiCheck
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
