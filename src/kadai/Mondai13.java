package kadai;

public class Mondai13 {
	public static void main(String[] args) {
		SummaryImpl t1 = new SummaryImpl();
		System.out.println(t1.exec(10,5));

		Summary t2 = new Summary() {    //SuperClassにジェネリクスない ＝ ジェネリクスいらない
			@Override
			public int exec(int a, int b) {
				return a+b;
			}
		};
		System.out.println(t2.exec(20,10));

		Summary t3 = (int a, int b) -> {
				return a+b;
		};
		System.out.println(t3.exec(25,20));

	}

}


interface Summary{                        //interfaceにジェネリクスあるか確認
	public int exec(int a, int b);
}

class SummaryImpl implements Summary{    //SuperClassにジェネリクスない ＝ ジェネリクスいらない

	@Override
	public int exec(int a, int b) {
		return a+b;
	}

}