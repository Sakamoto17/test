package kadai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Typing_Game {
	public static void main(String[] args) {
		File inputFile = new File("\\\\192.168.3.62\\public\\研修資料\\data.txt");

		ArrayList<String> quest = new ArrayList<>();
		BufferedReader in = null;

		try {
			in = new BufferedReader(new FileReader(inputFile)); //文字を出力するときは、Buffered系

			String line;

			while((line = in.readLine())!= null) {
				quest.add(line);
			}

			Scanner scn = new Scanner(System.in);
			String answer = "";

	        for(int i = 0; i < 5 ; i++) { //5回のループ
	        	int x = new Random().nextInt(quest.size());  //ランダム
		        String[] y = quest.get(x).split(",");
		        for (String z : y) {
		            System.out.println(z); //問題 分割かつランダム
		        }
		        quest.remove(x); //除去

		        do {
			        System.out.println();
			        System.out.println("【入力してください】");
			        answer = scn.nextLine();
			        System.out.println();
		        }while();

	        }
	        	scn.close();


		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in != null) {
					in.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}


/*

  ユーザーの入力を受け付けて、入力と表示した問題が同じかどうかを判定する

  ４で同じであれば次の問題へ違っていれば同じ問題を表示するようにする

  出力形式の調整と成績の計算・表示を行う
　※1秒当たりの文字数は小数点以下第1位まで表示（第2位を四捨五入）

 *
 */
