package kadai;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Mondai15_2 {
	public static void main(String[] args) {

	}

}

class CryptDecode2{
	public static void main(String[] args) {

		System.out.println("CryptDecode (復号化)");
		System.out.println("----------------------");
		Scanner scn = new Scanner(System.in);
		System.out.print("ファイル名：");
		String fName = scn.nextLine();
		System.out.print("データ: " );
//		String dName = scn.nextLine();

		File inputFile = new File("C:\\output\\"+fName);
//		File outputFile = new File("C:\\output\\"+fName);
		FileInputStream in = null;

//		for(int i = 0; i < dName.length(); i++) {
//			System.out.print("*");
//		}
		scn.close();

		try {
			in = new FileInputStream(inputFile);

			int c;

			while((c = in.read()) != -1) {
//					c = dName.charAt(i)-1; //sysoutでcを出す
//					out.write(c);

//				char charInt = (char)(c - 1);
				System.out.print((char)(c - 1));  //charからint変換したものを再度charで出力
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
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
