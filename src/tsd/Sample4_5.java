package tsd;

import java.util.ArrayList;

public class Sample4_5 {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList <String>();
		String st1 = "ready";
		String st2 = "set";
		String st3 = "go";
		// Integer i = 123;
		myList.add(st1);
		myList.add(st2);
		myList.add(st3);
		//myList.add(i); //コンパイルエラー

//		通常for文
		 for(int i =0; i < myList.size(); i++){
		 	String st = myList.get(i);
		 	System.out.println(st);
		 }

		/* 拡張for文*/
		for(String st : myList) {
			System.out.println(st);
		}

//		Iteratorを使用した取り出し
		String st = null;
		Iterator<String> itr = myList.iterator();
		while(itr.ahsNext());
			st = itr.next();
			System.out.println(st);
		 }

	}


