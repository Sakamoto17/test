package kadai;

import java.util.Scanner;

public class Kadai46_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);

//		人数を読み込む
		System.out.print("人数 : ");
		int count = scn.nextInt();

		int[] x = new int [count];

//		点数を人数分入力する
		for(int i = 0; i < count; i++) {
			System.out.print((i + 1) + "番目の点数 :");
			x[i] = scn.nextInt();
		}

//		合計
//		平均
//		最高
//		最低

		int sum = 0;
		int max = x[0];
		int min = x[0];

		for(int i = 0; i < count; i++) {
			sum = sum + x[i];

			if(max < x[i]) {
				max = x[i];
			}
			if(x[i] < min) {
				min = x[i];
			}

		}
		System.out.println(sum);
		System.out.println((double)sum / x.length);
		System.out.println(max);
		System.out.println(min);



		scn.close();

	}
}


