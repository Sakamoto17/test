package kadai;

import java.util.Scanner;

public class Kadai19 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("整数A : ");
		int a = scn.nextInt();
		System.out.print("整数B : ");
		int b = scn.nextInt();

		int start, end;
		if(a < b) {
			start = a;
			end = b;
		}else {
			start = b;
			end = a;
		}
		int i = start;
		do {
			System.out.println(i++);
			System.out.println("");
		} while(i < end );
		System.out.print(i);
		System.out.println();

//		while( x <= y) {
//			System.out.print(x + " ");
//			x++;
//		}

	}

}
