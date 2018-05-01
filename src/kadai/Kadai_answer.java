package kadai;

public class Kadai_answer {
	public static void main(String[] args) {
		System.out.println("1からnまでの和を求めます。");

		int n = 7;
		System.out.println("nの値:" + n );


		int x = 0;
		for(int x = 1; x <= n  ; x++) {
			int sum = sum + x;

			if(x < n) {
				System.out.print(x + "+");
			} else {
				System.out.print(x + "=");
			}
		}
		System.out.println(sum);

	}
}
