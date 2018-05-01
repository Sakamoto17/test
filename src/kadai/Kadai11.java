package kadai;

import java.util.Random;

public class Kadai11 {
	public static void main(String[] args) {
		int x = new Random().nextInt(3);
		switch (x) {
		case 1:
			System.out.println("グー");
			break;
		case 2:
			System.out.println("チョキ");
			break;
		default:
			System.out.println("パー");
		}

	}

}
