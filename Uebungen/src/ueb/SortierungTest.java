package ueb;

public class SortierungTest {

	public static void main(String[] args) {
		int a, b, c, temp;
		a = 9;
		b = 7;
		c = 5;
		
		if (b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		if (b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		
		System.out.println(" a = " + a + ", b = " + b + ", c = " + c);
	}

}
