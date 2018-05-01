package kadai;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Kuraberu k = new Kuraberu();

		System.out.print("a :");
		int x = scn.nextInt();
		System.out.print("b :");
		int y = scn.nextInt();

		k.a = x;       //scnで得た数値を入れる
		k.b = y;

		int bigger = k.getBigger();
		int smaller = k.getSmaller();
		System.out.print("大きいほうは"+ bigger + "です。");
		System.out.print("小さいほうは"+ smaller + "です。");

		scn.close();
	}

}

class Kuraberu{
//	属性；int a, int b
	int a;
	int b;

	int getBigger () {
		if(a< b) {
			return b;
		}else {
			return a;
		}

	}

	int getSmaller() {
		if(a < b) {
			return a;
		}else {
			return b;
		}
	}


}
//	操作；属性値aとbを比較して大きいほうを戻すメソッド（引数なし）


//	メソッド名; getBigger()戻り値は自分で考える。


