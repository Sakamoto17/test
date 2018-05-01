package tsd;

public class Sample3_4 {
	public static void main(String[] args) {
		int age = 15;

		System.out.println("18歳以上ですか？");



//		String str = age < 18 ? "18歳未満です。":"18歳以上です。";


		String str;
		if( age >18 ) {
			str = ("18歳以上です。");
		} else {
			str = ("18歳未満です。");

		}
		System.out.println(str);
	}
}
