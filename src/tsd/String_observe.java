package tsd;

public class String_observe { //単純だった…
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = str1;
		String str4 = new String("hello");

		if(str1 == str2) {
			System.out.println("t");
		}else {
			System.out.println("f");
		}
		if(str1 == str3) {
			System.out.println("t");
		}else {
			System.out.println("f");
		}
		if(str1 == str4) {
			System.out.println("t");
		}else {
			System.out.println("f");
		}

		if(str1.equals(str2)) {
			System.out.println("t");
		}else {
			System.out.println("f");
		}
		if(str1.equals(str3)) {
			System.out.println("t");
		}else {
			System.out.println("f");
		}
		if(str1.equals(str4)) {
			System.out.println("t");
		}else {
			System.out.println("f");
		}




	}
}
//
//class StringOne{
//	private String a;
//	private String b;
//	private String c;
//	private String d;
//
//	}
//}

