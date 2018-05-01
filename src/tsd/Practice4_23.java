package tsd;

public class Practice4_23 {
	public static void main(String[] args) {
		Practice4_23 p = new Practice4_23(); //オブジェクト

		p.testMethod(new Int(){
			@Override
			public void method(String s) {
				System.out.println(s);
			}
		});                           //ここまでひとくくり()
	}

//		ノーマル
//	Pre1 p1 = new Pre1();
//	System.out.println(p1.test(100));
//
//		匿名クラス
//
//	Presucate<Integer> p2 = new Predicate<Integer>() {
//		@Override
//		public boolean test(Integer t) {
//			return t ==1;
//		}
//	};
//	System.out.println(p2.test(100));
//
//		ラムダ式　らく。
//
//	Predicate<Integer> p3 = (Integer t) ->{
//		return t == 1;
//	};
//	System.out.println(p3.test(100));

//	ラムダ式　めちゃらく。
//	Predicate<Integer> p4 = (t) -> t == 1;
	//	System.out.println(p3.test(100));



	void testMethod(Int i) {
		System.out.println("testMethod");
		i.method("hello");
	}
}

interface Int{
	public void method(String s);
}