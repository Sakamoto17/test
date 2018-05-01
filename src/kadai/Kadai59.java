package kadai;

import java.util.Scanner;

public class Kadai59 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

//		整数を聞く
		System.out.print("整数a : ");
		int a = scn.nextInt();
		System.out.print("整数b : ");
		int b = scn.nextInt();
		System.out.print("整数c : ");
		int c = scn.nextInt();

		Test59 t1 = new Test59();
		int result = t1.med(a, b, c);

//		中央値を出力
		System.out.print("中央値は"+ result + "です。");

		scn.close();
	}

}

class Test59{
	int med(int a, int b, int c) {

		int x = 0;
		if(b < a && a < c) {
			x = a;
		}else if(c < a && a < b) {
			x = a;
		}else if(a < b && b < c) {
			x = b;
		}else if(c < b && b < a){
			x = b;
		}else if(a < c && c < b){
			x = c;
		}else if(b < c && c < a) {
			x = c;
		}else if(a == b && b < c || c < b) {
			x = b;
		}else if(b == c && c < a || a < c) {
			x = c;
		}else if(c == a && a < b || b < a) {
			x = a;
		}else if(a == b && b == c) {
			x = a;
		}
		return x;

	}

}
