package kadai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Typing_copy {
	public static void main(String[] args) {
		File inputFile = new File("\\\\192.168.3.62\\public\\研修資料\\data.txt");
		Scanner scn = new Scanner(System.in);

		ArrayList<String> quest = new ArrayList<>();
		BufferedReader in = null;

		try {
			in = new BufferedReader(new FileReader(inputFile)); //文字を出力するときは、Buffered系

			String line;

			while((line = in.readLine())!= null) {
				quest.add(line);
			}
//			System.out.println(quest);//確認用

//			for(String s : quest) {
//				System.out.println(s);
//			}                         //確認用 その2
	        for(int i = 0; i < 5 ; i++) { //5回のループ
	        	int x = new Random().nextInt(quest.size());//ランダム
	        	String str = quest.get(x);

				String line1 = str.split(",")[0];   //2つのStringを作る
				String line2 = str.split(",")[1];   //ここから、二分する

				//二つに分ける
				System.out.println(line1);
				System.out.println(line2);
				System.out.println();


		        System.out.println();       //問題出題文
		        System.out.println("【入力してください】");
		        String answer = scn.nextLine();
		        System.out.println();
		        if(answer.equals(line2)) {
		        	System.out.println("正解です");
		        }else {
		        	System.out.println("不正解です");
		        }
		        System.out.println();

				quest.remove(str);

	        }
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

				scn.close();
		}

	}
//}