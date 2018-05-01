package tsd;

import java.util.function.Predicate;

/*Predicate をインターフェース実装するプログラム
 * 1.implementsしてやるパターン
 * 2.匿名クラスを使うパターン
 * 3.ラムダ式を使うパターン
 */

public class Rensyu_Lamb {
	public static void main(String[] args) {
		PredicateImp t1 = new PredicateImp();
		System.out.println(t1.test("public static void"));

		Predicate<String> t2 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length() >= 10;
			}
		};
		System.out.println(t2.test("String args"));
		
		PredicateImp<String> t3 = PredicateImp<String>


	}
}

class PredicateImp implements Predicate<String>{

	@Override
	public boolean test(String t) {
		return t.length() >= 10;
	}

}