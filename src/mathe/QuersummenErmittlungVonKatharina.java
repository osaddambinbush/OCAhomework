package mathe;

public class QuersummenErmittlungVonKatharina {

	public static void main(String[] args) {
		long		num				;	// original number
		int			digit			,	// single digits of original number
					digitSum		;	// sum of digits of original number
		String		numString		,	// original number as string
					digitString		,	// single digit of original number as string
					splitString		;	// original number as string with digits seperated by ","
		String[]	digitSumArray	;	// Array with elements beeing digits of original number as strings

		num = 1_800_084_848_567_456_567L;

		numString = String.valueOf(num);
		splitString = "";
		for (int i = 0; i < numString.length(); i++) {
			digitString = numString.substring(i, i + 1);
			if (i < numString.length() - 1) {
				splitString += digitString + ",";
			} else {
				splitString += digitString;
			}
		}

		digitSumArray = splitString.split(",");

		digitSum = 0;
		for (int i = 0; i < digitSumArray.length; i++) {
			digit = Integer.parseInt(digitSumArray[i]);
			digitSum += digit;
		}

		System.out.println("Die Quersumme von " + num + " beträgt: " + digitSum);
	}

}
