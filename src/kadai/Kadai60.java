package kadai;

import java.util.Scanner;

public class Kadai60 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		和を求める、という文章を出力
		System.out.println("1からzまでの和を求めます。");
//		zの値を聞く
		System.out.print("zの値： ");
		int z = scn.nextInt();

		Test60 t1 = new Test60( );
		int result= t1.sumup(z);

		System.out.print("1から"+ z +"までの和は"+ result +"です。");

		scn.close();

//		答えが出る。
	}

}

class Test60{

	int sumup(int n) {
		int sum =0;
		for(int i = 0; i < n; i++) {
			sum = sum + (i+1);
		}
		return sum;
	}

}
