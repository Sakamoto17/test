package kadai;

public class Kadai03 {

	public static void main(String[] args) {
		int x = 13;
		if (x < 0) {
			System.out.println("正でない値が入力されました。");
		} else if (x % 5 == 0 ) {
			System.out.println("その値は5で割り切れます。");
		} else if(x % 5 != 0 ){
			System.out.println("その値は5で割り切れません。");

		}

	}
}
