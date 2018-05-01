package kadai;

public class Rensyu1 {
	public static void main(String[] args) {
		int n = 10;
		for(int x = 1; x <= n; x++) {

			if(x < n) {
				System.out.print(x+ ",");
			}else {
				System.out.print(x);
			}
		}
	}
}