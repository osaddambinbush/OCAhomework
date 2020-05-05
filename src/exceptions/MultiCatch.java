package exceptions;

import java.util.Random;

public class MultiCatch {

	public static void main(String[] args) {

		try {
			m();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("got The Arrayoutofbounds");
		} catch (ArithmeticException e) {
			System.out.println("got the Arithmetic krams");
		}

	}

	static void m() throws ArrayIndexOutOfBoundsException, ArithmeticException {
		Random r = new Random();
		if (r.nextBoolean()) {
			throw new ArithmeticException();
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}

	}

}
