package kadai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Typing_answer {
	private static final String DATA_PASS = "\\\\192.168.3.62\\public\\研修資料\\data.txt";
	private static final int QUESTION_COUNT = 5;

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(DATA_PASS);
		Scanner scn = new Scanner(System.in);
		BufferedReader br = null;

		try {
			ArrayList<String> data = new ArrayList<>();
			br = new BufferedReader(new FileReader(file));

			String line;
			while((line = br.readLine()) != null) {
				data.add(line);
			}

//			for(String s : data) {
//				System.out.println(s);
//			}  //デバッグ


			for(int i = 0; i < QUESTION_COUNT; i++) {

			//ランダム生成
			int x = new Random().nextInt(data.size());//ランダム
			String str = data.get(x);//ArrayListから要素を1つ取り出す。
//			System.out.println(data.get(x));

			String line1 = str.split(",")[0];   //2つのStringを作る
			String line2 = str.split(",")[1];   //ここから、二分する

			//二つに分ける
			System.out.println("第" +(i + 1 ) + "問");
			System.out.println(line1);
			System.out.println(line2);
			System.out.println();

			System.out.println("入力してください");
			String input = scn.next();
			while(true) {
				if(input.equals(line2)) {
					System.out.println("正解です");
					break; //ループを抜ける //次の問題へ
				}
			}
			data.remove(str);
		}

		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			scn.close();
			throw new FileNotFoundException("みつかりませんでした");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) {
					br.close();
				}
			}catch(IOException e) {

			}
		}

	}

}
