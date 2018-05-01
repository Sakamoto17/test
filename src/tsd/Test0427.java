package tsd;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test0427 {
	public static void main(String[] args) {
	//ArrayList と LinkedListのランダムアクセスの違いを検証する


		ArrayList<Integer> observe = new ArrayList<>();

		for(int i = 0; i < 100000; i++) {
			observe.add(i);
		}

		long start = System.currentTimeMillis();

		for(int i = 0; i < 100000; i++) {
			observe.get(i);
		}

		long end = System.currentTimeMillis();
		System.out.println("ArrayList処理時間: " +(end - start));


		LinkedList<Integer> observe2 = new LinkedList<>();

		for(int j = 0; j < 100000; j++) {
			observe2.add(j);
		}
		long start2 = System.currentTimeMillis();

		for(int j = 0; j < 100000; j++ ) {
			observe2.get(j);
		}

		long end2 = System.currentTimeMillis();
		System.out.println("LinkList処理時間: " +(end2 - start2));
	}
}


//一回目
//ArrayList処理時間: 2
//LinkList処理時間: 5740

//二回目
//ArrayList処理時間: 0
//LinkList処理時間: 5799

//三回目
//ArrayList処理時間: 1
//LinkList処理時間: 5815
