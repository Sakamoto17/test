package kadai;

import java.util.Arrays;

public class Mondai14 {
	public static void main(String[] args) {
		String[] array = {"abc", "abcdefg", "a", "ab", "cdefg"};


		ComparatorSub sub = new ComparatorSub();

		Arrays.sort(array,new ComparatorSub());
		System.out.println(Arrays.toString(array));
	}
}

interface Comparator<String>{
	int compare(String o1, String o2);

}

class ComparatorSub implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.length() < o2.length() ? 1: -1;
	}

}


