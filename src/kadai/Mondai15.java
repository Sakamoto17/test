package kadai;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Mondai15 {
	public static void main(String[ ] args) {

	}
}

class CryptEncode2{
	public static void main(String[ ] args) {

		System.out.println("CryptEncode (暗号化)");
		System.out.println("----------------------");
		Scanner scn = new Scanner(System.in);
		System.out.print("ファイル名：");
		String fName = scn.nextLine();
		System.out.print("データ: " );
		String dName = scn.nextLine();

		File outputFile = new File("C:\\output\\"+fName); //Fileをnewする
		FileOutputStream out = null;

		for(int i = 0; i < dName.length(); i++) {  //データを出力
			System.out.print("*");
		}

		System.out.println();
		System.out.println("暗号化が終わりました。");
		scn.close();

		try {
			out = new FileOutputStream(outputFile);  //FileOutputStreamをnew
			int c = 0;
			for(int i = 0; i < dName.length(); i++) {
				c = dName.charAt(i)+1;
				out.write(c);
//				System.out.println(c);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
