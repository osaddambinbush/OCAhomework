package uebungen.regentage;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Regentage {

	public static void main(String... args) {
//  Unter dem angegebenen Link finden Sie die Daten, die Sie unten in diesem Java-PRG als Kommentar sehen können.
//  https://de.statista.com/statistik/daten/studie/1892/umfrage/staedte-in-deutschland-mit-den-meisten-regentagen/
//  Bitte führen Sie die Daten sinnvoll strukturiert zusammen (z.B. Klasse Regentage mit Attributen name und regentage).
//  Bitte geben Sie dann die Orte und zugehörigen Regentage zeilenweise untereinander aus.
//  Original-Daten (Achtung: Zahlen sind f. alle 40 Orte doppelt)
// Erweitern Sie den Code mit einer Suchfunktion

		String orte = "Halle an der SaaleKölnFreiburgEssenMülheimWuppertalBielefeldBochumBonnRegensburgNürnbergKielHamburgMünchenKoblenzGöttingenDüsseldorfDortmundAugsburgHannoverSchwerinSaarbrückenPotsdamDresdenDarmstadtWiesbadenMainzFrankfurt am MainLeipzigMagdeburgErfurtWeimarStuttgartFrankfurt an der OderBremenBerlinKarlsruheMönchengladbachMoersTrierEnd";
		String rDays = "266266263263218218208208208208206206205205202202201201201201201201195195195195193193193193193193185185185185184184182182181181180180179179179179177177176176176176173173167167166166166166166166166166165165163163148148139139107107107107107107EndEnd";
		String ort = "";
		StringBuilder sb = new StringBuilder(rDays);
		StringBuilder sb1 = new StringBuilder(orte);
		ArrayList<String> aL = new ArrayList<String>();
		ArrayList<String> aL1 = new ArrayList<String>();
		ArrayList<String> aLo1 = new ArrayList<String>();
		aL.add(rDays);

		for (int i = 1; i < sb1.length(); i++) {

			char ch = sb1.charAt(i);
			char ch1 = sb1.charAt(i - 1);
			if (!Character.isSpaceChar(ch1) & Character.isUpperCase(ch) ) {
				ort = sb1.substring(0, i);
				sb1.delete(0, i);
				aLo1.add(ort);
				i = 1;
			
			}

		}

		for (int i = 0; i < aL.toString().length(); i++) {

			if (sb.length() >= 6) {
				String rain = sb.substring(0, 3);
				sb.delete(0, 6);
				aL1.add(i, rain);
			}
		}
		for (int i = 0; i < aL1.size() -1; i++)
			System.out.println( "Nr: " +(i+1)+ " "+ aLo1.get(i) + " hatte im Jahr 2004 '" + aL1.get(i) + "' Regentage.");

		String search = JOptionPane.showInputDialog(null, "Bitte die Stadt eingeben, die Sie suchen:", "Städtesuche",
				JOptionPane.PLAIN_MESSAGE);

		for (int i = 0; i < aLo1.size(); i++)
			if (search !=null & search.equals(aLo1.get(i))) 
				System.err.println("Suchergebnis: " + aLo1.get(i) + " hat " + aL1.get(i) + " Regentage (Stand: 2004)");
			

	}

}
