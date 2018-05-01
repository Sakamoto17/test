package tsd;

import java.util.function.Predicate;

public class Lamb {
	public static void main(String[] args) {
		PredicateImpl p1 = new PredicateImpl(); //PredicateImplの初期化
		System.out.println(p1.test("WonderfulWorld"));//implements ver. p1


		//匿名クラス
		Predicate<String> p2 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length() >= 10;
			}

		};
		System.out.println(p2.test("Alice"));  //匿名クラス ver. p2

		//ラムダ式
		Predicate<String> p3 = (String t) -> {
			return t.length() >= 10;
		};
		System.out.println(p3.test("MarchRabbit"));

		//ラムダ式　省略
		Predicate<String> p4 = t -> t.length() >= 10;
		System.out.println(p4.test("MudHutter"));
	}
}


class PredicateImpl implements Predicate<String>{

	@Override
	public boolean test(String t) {
		return t.length() >= 10;  //10文字以上かどうかを判定
	}

}
