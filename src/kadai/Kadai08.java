package kadai;

public class Kadai08 {
	public static void main(String[] args) {
		int a = 33;
		int b = 11;
		int c = 22;

		System.out.print("最小値は");
		if (b >= a && c >= a ) {
		System.out.println( a +"です。");
		} else if( a >= b  && c >= b) {
			System.out.println( b + "です。");
		} else if (b >= c && a >= c) {
			System.out.println( c + "です。");
		}
	}

}
