package kadai;
//	インデントに気を付けること

public class Mondai_11 {
	public static void main(String[] args) {
		String[]a = {"5","a", "89","b", "c"};

		Mondai_11 obj = new Mondai_11();
		int[] b = obj.makeArray3(a);

		System.out.print("{");
		for(int i : b) {
			System.out.print(i +" ");
		}
		System.out.print("}");
	}


	public int[] makeArray1 (String[] a){
		int b[] = new int [a.length];

		for(int i = 0; i< a.length; i++) {
			try {
				b[i] = Integer.parseInt(a[i]);

			}catch(NumberFormatException e) {

			}
		}
			return b;

		}

	public int[] makeArray2 (String[] a){
		int b[] = new int [a.length];

		try {
			for(int i = 0; i< a.length; i++) {
				b[i] = Integer.parseInt(a[i]);
			}

			}catch(NumberFormatException e) {

			}
			return b;

		}

	public int[] makeArray3 (String[] a){
		int b[] = new int [a.length];

		try {
			for(int i = 0; i< a.length; i++) {
				b[i] = Integer.parseInt(a[i]);
			}
			return b;

			}catch(NumberFormatException e) {

			}
			return new int[a.length]; //初期値にしてしまえばよい、覚える

		}
}

//もう一度復習すること
