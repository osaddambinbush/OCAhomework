package _06_17;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


/**
 * 
 * departure: Jun 17 2020 07:30 PM (America/Los_Angeles) Flugdauer: 8 Stunden
 * 
 * Gesucht ist Ankunft: Beispiel: Jun 21 2020 07:30 PM (Africa/Addis_Ababa)
 * 
 * schreibt eine Methode, die aus einem Abfahrt (datum, Uhrzeit und ort) (wie
 * oben gegeben) den Ankunftszeit (datum, Uhrzeit udn ort) ermitellt
 *
 */

public class Uebung {
	
	//
	public static void timeDestination(ZonedDateTime a, long hours, long min, ZoneId zID) {
		ZonedDateTime destination = a.plusHours(hours).plusMinutes(min).withZoneSameInstant(zID);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM dd yyyy  hh:mm a VV");
		System.out.println(destination.format(df));

	}

	public static void main(String[] args) {

		//Abflug
		ZonedDateTime abf = ZonedDateTime.of(LocalDateTime.of(2020, Month.JUNE, 17, 19, 30),
				ZoneId.of("America/Los_Angeles"));
		
		//Flugdetails
		long hours = 17;
		long minutes = 51;
		
		//Zone Ziel: 
		ZoneId zId = ZoneId.of("Africa/Addis_Ababa");
		timeDestination(abf, hours, minutes, zId);


	}
}
