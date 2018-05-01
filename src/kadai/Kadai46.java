package kadai;

import java.util.Scanner;

public class Kadai46 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);

//		人数を聞く
		System.out.print("人数： ");
		int count = scn.nextInt();

		int[]x= new int[count];

//		点数を入力するように指示
//		→聞いた人数分点数を聞く
		System.out.println("点数を入力せよ。");
		for(int i = 0; i < count; i++) {
			System.out.print((i + 1 ) + "番目の点数 :");

			x[i]= scn.nextInt();

		}

//		全員の合計点を出す
		int sum = 0;
		int max = x[0];
		int min = x[0];

		for(int y : x) {
			sum += y;
			if(max < y ) {
				max = y;
			}
			if(y < min) {
				min = y;
			}

		}
		System.out.println("合計点は"+ sum + "点です。");

//		全員の平均点を出す
		System.out.println("平均点は" + ((double)sum / x.length)+ "点です。"); // 平均点はここで計算している。
//		lengthを使って、人数が何人でも出せるようにする


//		全員の中での最高点を出す
		System.out.println("最高点は"+ max + "点です。");
		System.out.println("最低点は"+ min + "点です。");


//		全員の中での最低点を出す


		scn.close();

	}

}
