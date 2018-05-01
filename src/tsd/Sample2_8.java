package tsd;

public class Sample2_8 {
	public static void main(String[] args) {
		int num;

		System.out.println("後置の場合");
		num = 10;
		System.out.println(num++);		//num=10を確認、その後+1をして11になった
		System.out.println(num);		//numを呼び出した　11

		System.out.println("前置の場合");
		num = 10;							// num をもう一回入れているのは、前の数値に切り替わっているため
		System.out.println(++num);		//ここですでにnum=10 +1をして11になった
		System.out.println(num);		//numを呼び出した　11

		System.out.println("-をお試し");
		System.out.println(num--);
		System.out.println(num);
		System.out.println(--num);



	}

}
