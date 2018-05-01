package tsd;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Sample12_17 {
	public static void main(String[] args) {
		NavigableMap<String, String> map = new TreeMap<String, String>();
		map.put("1111", "ItemA");
		map.put("2222","ItemB");
		map.put("3333","ItemC");
		map.put("4444","ItemD");
		map.put("5555","ItemE");

		String key = "2000";

		if(map.containsKey(key)) {
			System.out.printf("%s に対する商品は %sです %n", key, map.get(key));
		}else {
			String lowerKey = map.lowerKey(key);
			String higherKey = map.higherKey(key);
			System.out.printf("%sに近い商品%n", key);
			if(lowerKey != null) {
				System.out.printf("lower  : %s(%s)%n", map.get(lowerKey),
					lowerKey);
			}
			if(lowerKey != null) {
				System.out.printf("lower  : %s(%s)%n", map.get(higherKey),higherKey);
			}
		}
		NavigableMap<String, String> sub = map.subMap("2000", true, "3500", true);

		double y = 200;
		System.out.printf("2000 - 3500 : %s", sub);
		System.out.println();
		System.out.printf("%.2f",y);
		//printfとは？ ＝("文字列", 引数（可変長引数）);
		//"文字列"%s = %sの部分に引数が前から順に入ってくる。
		//String s = String.format()  フォーマッター、printfと使い方は同じ

//		%s 文字列
//		%d 整数  double ではない！
//		%,dと打つと、3桁ごとにカンマを打ってくれる！
//		%f 小数点
//      %.2f = 小数点第二位まで表示 数字を変えれば任意の位まで出してくれる。

	}

}
