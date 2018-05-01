package tsd;

import java.util.ArrayList;
import java.util.List;

public class Test0501 {
	public static void main(String[ ] args) {

	String s = "hello";
	System.out.println(s);

	int i = 100;
	System.out.println(i);

	List<Integer> a = new ArrayList<>();
	a.add(new Integer( 100 ));

	short sh = 5;
	int in = sh; //型変換
	Integer wi = sh; //ラッパークラスには持っていけない

	Short sh2 = 10;
	int in2 = sh2.shortValue();  //基本データ型にする変換->基本データ型なら型変換できる




	System.out.println(a);  //配列の中身はこのままじゃ出せない

	}
}

class Test05{
	private String name;
	public Test05(String name) {
		this.name =  name;
	}

}




