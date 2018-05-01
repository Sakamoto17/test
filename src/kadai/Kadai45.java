package kadai;

import java.util.Random;
import java.util.Scanner;

public class Kadai45 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		要素数を聞く
		System.out.print("要素数：");
		int count= scn.nextInt();
		scn.close();

		int[]arr = new int [count];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(10) + 1; //ランダムのやつ
		}

		for(int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println();

		for(int j = 10; j > 0; j--) {
			for(int i = 0; i < arr.length; i++) {
				if(j <= arr[i]) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
	}

	for(int i = 0; i < arr.length; i++) {
		System.out.print("--");
	}
	System.out.println();

	for(int i = 0; i < arr.length; i++) {
		System.out.print((i % 10)+ " ");
	}

	}
}
