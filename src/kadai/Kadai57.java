package kadai;

import java.util.Scanner;

public class Kadai57 {
	public static void main(String[] args) {
		//入力を受け取る
		Scanner scn = new Scanner(System.in);  //Scannerのインスタンス化！

		Test57 s1 = new Test57();
		System.out.print("整数x :");
		int count = scn.nextInt();

		int result = s1.signOf( count );

		System.out.print("signOf(x)は"+ result + "です。");


		//signOfメソッドを実行
		//実行結果の出力
		scn.close();
	}

}

class Test57{
	//signOfメソッドを作る
	int signOf (int n) {
		int result = n; // int result = 0の方が楽じゃね
		if(n == 0) {
			result = 0; //return 0 でOK
		}else if(n < 0){
			result = -1; //return -1でOK
		}else if(n > 0) {
			result = 1; //return 1 でOK、ただし、その場合はelseで止めること。
		}
		return result;
	}

	}

	//（sysoutは入れてはいけない）
