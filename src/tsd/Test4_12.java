package tsd;

public class Test4_12 {

	public static void main(String[] args) {
		System.out.println("main start");

		//メソッドの呼び出し元

		Hoge h1 = new Hoge();
		h1.method1();                         //メソッドを呼び出し（下のクラスHogeから呼んでいる）。
		h1.method2("hogehoge");				  //hogehogeがインプットされたので出力する。
		String s = h1.method3();			  //helloがアウトプット
		System.out.println(s);
		int result = h1.method4(123,456);
		System.out.println(result);

		System.out.println("main finish");
	}

}

class Hoge{

	int method4(int x, int y) {
		System.out.println("method4 called.");
		int z = x + y;
		return z;
	}


	void method1() {                          //引数・戻り値なし
		System.out.println("method1 called.");
	}


	//引数あり・戻り値なし
	void method2(String s) {                // s = "hogehoge"
		System.out.println("method2 called.");
		System.out.println(s);
	}

	//引数なし・戻り値あり
	String method3() {
		System.out.println("method3 called.");
		String h = "hello";
		return h;							//戻り値：メソッドの結果を呼び出し元に返す。
	}

	//引数も戻り値もあり
//	int method4(int x, int y) {
//		System.out.println("method4 called.");
//		int z = x + y;
//		return z;
	}

//}


