package kadai;

import java.util.Scanner;

public class Kadai22 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);


//		聞きます。
//		同じく整数値を聞きます。
		System.out.println("正の整数値の桁を求めます。");
		System.out.print("正の整数値：");
		int count = scn. nextInt();

		if(count < 10) {
			System.out.print("その桁数は1桁です。");
		}else if(count < 100){
			System.out.print("その桁数は2桁です。");
		}else if(count < 1000) {
			System.out.print("その桁数は3桁です。");
		}

//		String str = count <= 10 ? "その桁数は1桁です。": "その桁数は2桁です。";
//		String str = count < 100? "その桁数は2桁です。":"その桁数は3桁です。";
//		System.out.print(str);

//		その桁数を答えます。


		scn.close();
	}

}
