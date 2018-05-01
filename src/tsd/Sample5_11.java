package tsd;

class RefTest{
	void metTest1(int num) {
		num += 30;
		System.out.println("int型定義側は"+ num);
	}

	void metTest2(int[] array) {
		array[0] += 30;
		System.out.println("配列定義側は"+ array[0]);
	}

	void metTest3(String str) {
		str += 30;
		System.out.println("String型定義側は"+ str);
	}
}

public class Sample5_11 {
	public static void main(String[] args) {
		int num = 20;
		int[] array = {20,40};
		String str = "20";
		RefTest obj = new RefTest();

		obj.metTest1(num);
		System.out.println("int型呼び出し側は"+ num);
		obj.metTest2(array);
		System.out.println("配列呼び出し側は"+ array[0]);
		obj.metTest3(str);
		System.out.println("String型呼び出し側は"+str);
	}
}
