package kadai;

public class Mondai0420 {
	public static void main(String[] args) {
		String[] a = {"5","23", "a", "89", "b", "c"};

		Mondai0420 obj = new Mondai0420();
		int[] b = obj.makeArray1(a);
		//String をintに
		//それで配列を作ってtryをやる？
		System.out.print("{");
		for(int i : b) {
			System.out.print(i+" ");
	}
		System.out.print("}");
	}

	int[] makeArray1(String[] a) {
		int[] b = new int[a.length];

		for(int i = 0; i< a.length; i++) {
			try {
				b[i] = Integer.parseInt(a[i]); //例外

			}catch(NumberFormatException e){
//				e.printStackTrace();
			}
		}
		return b;
	}

	int[] makeArray2(String[] a) {
		int[] b = new int[a.length];

		try {
			for (int i = 0; i < a.length; i++) {
				b[i] = Integer.parseInt(a[i]);
			}
		}catch(NumberFormatException e) {

		}
		return b;
	}

	int[] makeArray3(String[] a) {
		int[] b = new int[a.length];

		try {
			for (int i = 0; i < a.length; i++) {
				b[i] = Integer.parseInt(a[i]);
			}
			return b;

		}catch(NumberFormatException e) {

		}
		return new int[a.length];
	}
}
