package kadai;

import java.util.Scanner;

public class Kadai21 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);

//		何個表示させるかを聞く。
		System.out.print("何個表示しますか : ");
		int count= scn.nextInt();

//		聞いた数だけ、＊を出す。その際、＋でつなぐこと。
		for(int i = 0; i < count; i++) {
			if(i < count-1) {
				System.out.print("*" + " " +  "+");
			}else if(i < count){
				System.out.print("*");
			}
		}

		scn.close();


	}

}
