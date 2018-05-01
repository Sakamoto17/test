package kadai;

import java.util.Scanner;

public class Kadai44 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

//		要素数を聞く
		System.out.print("要素数；");
		int count = scn.nextInt();

//		ハコを作っておく
		int[] x = new int [count];

//		聞いた要素のぶん、箱に入れる
		for(int i = 0; i < count; i++) {
			System.out.print("a [" + i + "] = ");
			x[i] = scn.nextInt();
		}
//		入れた数値を出力
		System.out.print("{");

		for(int i = 0; i < count; i++){
			if(i < count- 1) {
				System.out.print(x[i] + ",");
			}else {
				System.out.print(x[i]);
			}

		}

		System.out.print("}");

		scn.close();
	}
}

