package tsd;

public class Mondai13_2 {
	public static void main(String[] args) {
		SummaryImpl t1 = new SummaryImpl();
		System.out.println(t1.exec(10, 5));  //implements

		Summary t2 = new Summary() {
			@Override
			public int exec(int a, int b) {
				return a+b;
			}

		};
		System.out.println(t2.exec(10, 5));  //匿名クラス

		Summary t3 = (int a, int b)->{
				return a+b;
		};
		System.out.println(t3.exec(10, 5)); //ラムダ式

	}

}

interface Summary{
	public int exec(int a, int b);
}

class SummaryImpl implements Summary{

	@Override
	public int exec(int a, int b) {
		return a+b;
	}

}
