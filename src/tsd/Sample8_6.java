package tsd;

import java.util.function.Predicate;

public class Sample8_6 {
	public static void main(String[] arg) {
		Predicate<String> pre = t -> t.equals("hello");
		System.out.println(pre.test("hello"));

		System.out.println(pre.test("1"));
	}

}
