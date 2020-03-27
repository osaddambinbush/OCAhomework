package uebungen;

public class uebungMethoden1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m("Machu picchu"));
	}

	public static StringBuilder m(String rev) {
		StringBuilder sb = new StringBuilder(rev);

		return sb.reverse();

	}
}
