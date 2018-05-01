package kadai;

import java.util.Scanner;

public class Kadai61 {
	public static void main(String[] args) {
//		季節を聞く
		Scanner scn = new Scanner(System.in);
		System.out.print("何月ですか（1～12） : ");
		int a = scn.nextInt();
		scn.close();

		Test61 t1 = new Test61();

		int r = t1.season(a);

		if(r == 1) {
			System.out.println("その月の季節は春です。");
		}else if(r == 2) {
			System.out.println("その月の季節は夏です。");
		}else if(r == 3) {
			System.out.println("その月の季節は秋です。");
		}else if(r == 4) {
			System.out.println("その月の季節は冬です。");
		}else {
			System.out.println();
		}


	}



}
//ここで判定する
class Test61{
	int season(int m) {
		int x = 0;

		if(3<= m && m <= 5){
			x = 1;
		}else if(6 <= m && m <= 8 ) {
			x = 2;
		}else if(9 <= m && m <= 11) {
			x = 3;
		}else if(m == 12 || m <=2 && m != 0) {
			x = 4;
		}else{
			x = 0;
		}

		return x;


	}
//	その月が春夏秋冬のどれか?。

}
