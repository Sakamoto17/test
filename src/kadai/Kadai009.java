package kadai;

public class Kadai009 {
	public static void main(String[] args) {
		int a = 33;
		int b = 15;

		if( a > b) {
			System.out.println("大きいほうの値は" + a + "です。");
			System.out.println("小さいほうの値は" + b +"です。");
		} else if ( a < b ) {
			System.out.println("大きいほうの値は" + b +"です。");
			System.out.println("小さいほうの値は" + a +"です。");
		} else if( a == b) {
			System.out.println("二つの値は同じです。");
		}

	}

}
