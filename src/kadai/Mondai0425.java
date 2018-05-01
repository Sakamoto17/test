package kadai;

import java.util.function.Predicate;

public class Mondai0425 {
	public static void main(String[] args) {
		PredicateImple t1 = new PredicateImple();
		System.out.println(t1.test("ToukenRanbu"));

		Predicate<String> t2 = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length() >= 10;
			}
		};

		System.out.println(t2.test("Higekiri"));

		Predicate<String> t3 = (String t) -> {
			return t.length() >= 10;
		};
		System.out.println(t2.test("Hizamaru"));
	}
}

class PredicateImple implements Predicate<String>{

	@Override
	public boolean test(String t) {
		return t.length() >= 10;
	}

}
