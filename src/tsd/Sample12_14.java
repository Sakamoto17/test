package tsd;

public class Sample12_14 {
	public static void main(String[] args) {
		Integer wi1 = 100;
		Integer wi2 = 100;

		int i = 100;

		if(wi1 == 100) System.out.println("wi1 == 100");

		if(wi1 == wi2) System.out.println("wi1 == wi2");

		if(wi1 == i) System.out.println("wi1 == i");

		if(wi2 == i) System.out.println("wi2 == i");


		if(wi1.equals(100)) System.out.println("wi1.equals(100)");
		if(wi1.equals(wi2)) System.out.println("wi1.equals(wi2)"); //基本データとラッパの比較は×
		if(wi1.equals(i)) System.out.println("wi1.equals(i)");
		if(wi2.equals(i)) System.out.println("wi2.equals(i)");
	}

}
