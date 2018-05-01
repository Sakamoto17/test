package tsd;

public class Sample12_16 {
	public static void main(String[] args) {
		func(10);
	}

	static void func(long i) {System.out.println("(long i)");}  //暗黙変換
	static void func(Integer i) {System.out.println("(Integer i)");}//autoboxing
	static void func(int...i) {System.out.println("(int...i)");}//可変長引数
	//可変長引数＝指定した値が複数になっても呼び出しできる＝配列
	//いくつか引数がある場合は、一番最後のものにしか書けない。
	//＝複数可変長引数にはできない。
}

//優先度の高い奴が呼び出される＝他全部が呼び出されるわけではない。