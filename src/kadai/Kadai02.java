package kadai;

public class Kadai02 {

	public static void main(String[] args) {
		int a = 30;
		int b = 20;
//			 a / b
		if (  a % b == 0) {
			System.out.println("bはaの約数です。");
		}else if (  a % b != 0) {
			System.out.println("bはaの約数ではありません。");
		}
	}
}
