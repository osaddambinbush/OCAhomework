package _07_02;

/**
 * 
 * Klasse 1: -Teilnehmer: -Immutable -Fabrik-Methoden statt Konstruktoren
 * -Chainging Klasse 2: -Teilnehmerverwaltung f�r die Speicherung der TN soll
 * List verwendet werden
 * 
 * 
 * -Eine Methode, die alle TN in der Liste in eine Datei schreibt 1. Text Datei
 * 2. Object Datei (Serialization)
 *
 */
public class Uebung {

	public static void main(String[] args) {

//		if(!a.exists()) {
//			try {
//					a.mkdirs();
//					a.createNewFile();
//					
//					
//					}catch (IOException e) {
//						System.out.println(e);					}
//		
//		}
		Teilnehmer.add("Günni");
		Teilnehmer.add("Joschi");
		Teilnehmer.add("Alemu");
		Teilnehmer.add("Hernando");
		Teilnehmer.add("Anna");
		Teilnehmer.add("Salvador");
		Teilnehmer.add("Niklas");
		Teilnehmer.add("Mustafa");
		Teilnehmer.add("Holger");
		Teilnehmer.add("Christopher");
		Teilnehmer.add("Hans-Wurst");
		System.out.println(Teilnehmer.tn);
		Teilnehmer.export();
		
	}

	

}
