package tsd;

import java.util.Random;

public class Practice{
	public static void main(String[] args) {
		System.out.println("今日も花丸");

		int num = 10;
		int b = 3;

		System.out.println("num + b = " +( num + b));
		System.out.println("num - b = " + (num - b));
		System.out.println("num * b = " + (num * b ));
		System.out.println("num / b = "+ ( num / b));
		System.out.println("num % b = " +( num % b));

		System.out.println(num++);
		System.out.println(num);
		System.out.println(num+b);

		num = 10;

		System.out.println(++num);
		System.out.println(num);
		System.out.println(num+b);

		System.out.println(num == b);
		System.out.println(num >= b);
		System.out.println(num < b);


//		if文
		int a = 100;
		if ( a == 100) {
			System.out.println("はなまるをあげます！");
		} else if ( a >= 80) {
			System.out.println("がんばってえらい！");
		} else if ( a >= 60) {
			System.out.println("がんばったの？すごーい！");
		} else {
			System.out.println("もうちょっとだよ、がんばってー！");

		}
//swicth and Ramdom文

		int j = new Random().nextInt(3);
		System.out.print("こうぺんちゃんとじゃんけん…");
		switch (j) {
		case 0:
			System.out.println("ぐー");
			break;
		case 1:
			System.out.println("ちょき");
			break;
		case 2 :
			System.out.println("ぱー");

		}

		}

	}

