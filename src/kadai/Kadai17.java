package kadai;

import java.util.Scanner;

public class Kadai17 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
//		System.out.print("3桁の正の整数値 :");
//		int x = scn.nextInt();   不要

		int x; //変数宣言
		do {
			//入力値を取得
			System.out.print("3桁の正の整数値 :");
			x = scn.nextInt();			//ここに書きます。

			//ループの条件をここで設定
//			y = ( x != 100); // 三桁の整数値

		}while(x <  100 || x > 999 );

		System.out.print(x + "と入力しましたね。");

		scn.close();

		}


	}





