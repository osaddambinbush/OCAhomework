package _06_03;


/**
 * 
 * Enumeration (Aufzï¿½hlung)
 * 
 * 
 * ->Java 8 hat eine Menge von enums eingefï¿½hrt
 * ->Enum als Klasse
 * -> Enum Mit Konstruktoren und Methoden
 * ->Enum mit Attribute
 * ->Warum Enums?
 */

/**
 * 
 * Motivation: -ab java 5 -Abbildung der realen Welt (Menge aus wenigen
 * auflistbaren Elementen) -Typ-Sicherheit
 * 
 *
 */
/**
 * 
 * TODO: ->Definiere folgende Methoden:
 * 
 * 1. asISODate Eine Textuelle Darstellung YYYY-MM-DD soll zurï¿½ck gegeben werden
 * 2. asDEDate Eine textuelle Darstellung DD.MM.YYYY soll zurï¿½ck gegeben werden
 * 
 * 3. asUKDate Eine testuelle Darstellung MM-DD-YYYY soll zurï¿½ck gegeben werden
 * ->Das Enum Datum soll angepasst werden. -Anzahl von Tagen im Februar ist ja
 * davon abhï¿½ngig ob Schaltjahr vorliegt. Dies soll irgendwie berï¿½cksichtigt
 * werden ->Die Klasse Datum soll auch angepasst werden: Der Konstruktor soll
 * dafï¿½r sorgen, dass immer gï¿½ltiges Datum Objekt entsteht:
 * 
 * Datum(31, Monat.APR, 2020) -> ist nicht valid ->Man konnte in dem Fall eine
 * Fehlerausgabe machen und Standard Datum (1.1.1970) erzeugen Welche Methode
 * sollte man dann auch noch anpassen?
 *
 */
public class Datum {

	private int tag;
	private Monat monat;
	private int jahr;

	public String asISODate() {
		return"ISO Date= " + jahr + "-" + (monat.ordinal() + 1) + "-" + tag;
			}

	public String asDEDate() {
				return "DE Date= " + tag + "." + (monat.ordinal() + 1) + "." + jahr;
	}

	public String asUKDate() {
			return "UK Date= " + (this.monat.ordinal() + 1) + "-" + this.tag + "-" + this.jahr;
			}

	public static void main(String[] args) {
		
	
	Datum b = new Datum(29, Monat.FEB, 2020);

	b.asISODate();
	b.asDEDate();
	b.asUKDate();
	System.out.println(b.asDEDate());
	System.out.println(b.asUKDate());
	System.out.println(b.asISODate());
}

	public Datum(int tag, Monat monat, int jahr) {
		super();
try {
		if (!(tag > 0 && tag <= monat.getNumberOfDays(isLeapYear(jahr)))) {
			System.err.println("Format passt nicht, default Datum erzeugt");
			throw new Exception();
		}

		else {
			this.tag = tag;
			this.monat = monat;
			this.jahr = jahr;
		}}catch(Exception e) {
			System.out.println(e);}

	}

	private boolean isLeapYear(int jahr) {

		return jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0);
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		if (tag > 0 && tag <= monat.getNumberOfDays(isLeapYear(jahr)))
			this.tag = tag;
	}

	public Monat getMonat() {
		return monat;
	}

	public void setMonat(Monat monat) {
		if (this.getTag() <= monat.getNumberOfDays(isLeapYear(getJahr())))
			this.monat = monat;
	}

	public int getJahr() {
		return jahr;
	}

	public void setJahr(int jahr) {
		this.jahr = jahr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + jahr;
		result = prime * result + ((monat == null) ? 0 : monat.hashCode());
		result = prime * result + tag;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Datum other = (Datum) obj;
		if (jahr != other.jahr)
			return false;
		if (monat != other.monat)
			return false;
		if (tag != other.tag)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Datum [tag=" + tag + ", monat=" + monat + ", jahr=" + jahr + "]";
	}

}
