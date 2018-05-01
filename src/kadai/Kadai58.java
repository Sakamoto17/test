package kadai;

import java.util.Scanner;

public class Kadai58 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
//		整数をabcを聞く。
		System.out.print("整数a : ");
		int a = scn.nextInt();
		System.out.print("整数b : ");
		int b = scn.nextInt();
		System.out.print("整数c : ");
		int c = scn.nextInt();

		Test58 t1 = new Test58();

		int result = t1.min(a, b, c);
//		聞いた数値の最小値が出力されるようにする。
		System.out.print("最小値は"+ result +"です。");


		scn.close();
	}

}

class Test58{
//	メソッドを作る
	int min(int a, int b, int c) {

//		受けた数値の最小値を求められるようにする。

		int x = 0;
		if(a <= b && a <= c) {
			x = a;
		}else if(b <= c && b <= a) {
			x = b;
		}else if(c <= a && c <= b) {
			x = c;
		}
		return x;

	}

}