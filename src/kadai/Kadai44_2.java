package kadai;

import java.util.Scanner;

public class Kadai44_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);

//		要素数を任意で入力できる
		System.out.print("要素数；");
		int count = scn.nextInt();


//		任意の数分のボックスを作る
		int[] x = new int [count];

//		聞いた数をカウントしておく
		for(int i = 0; i < count; i++ ) {
			System.out.print("a[" + i + "] = ");
			x[i] = scn.nextInt();
		}
//		出力する
		System.out.print("{");
		for(int i = 0; i < count; i++) {
			if(i < count) {
				System.out.print(x[i]+",");
			}else {
				System.out.print(x[i]);
		}

		System.out.print("}");
			}
		scn.close();

		}






}


