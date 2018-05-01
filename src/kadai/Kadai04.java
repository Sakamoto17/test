package kadai;

public class Kadai04 {
	public static void main(String[] args) {
		int x = 70;
		if(x < 0 ){
			System.out.println("不正な点数です。");
		}else if( x <= 59) {
			System.out.println("不可");
		} else if (x >= 60 && x <= 69) {
			System.out.println("可");
		}else if (x >= 70 && x <= 79) {
			System.out.println("良");
		}else if (x >= 80 ) {
			System.out.println("優");


		}

	}
}


