package tsd;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample4_19 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");

		String[] array1 = list1.toArray(new String[] {});


		String[] array2 = {"c,d"};
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList(array2));
//		System.out.println(list2);
	}

}
