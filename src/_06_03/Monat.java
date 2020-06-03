package _06_03;

public enum Monat {
	JAN, FEB(28), MAR, APR(30), MAI, JUN(30), JUL, AUG, SEP(30), OKT, NOV(30), DEZ;

	private final int numberOfDays;

	Monat(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	private Monat() {
		
		this.numberOfDays = 31;
		
	}

	int makeInt() {
		return ordinal() + 1;// 1 - 12


	}

	public int getNumberOfDays (Monat monat, int tag) {
		return (this == FEB ) ? 28 : numberOfDays;
	}
	public int getNumberOfDays(boolean istSchaltJahr) {
		return (this == FEB && istSchaltJahr) ? 29 : numberOfDays;
	}
}