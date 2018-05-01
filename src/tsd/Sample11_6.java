package tsd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample11_6 {
	public static void main(String[] args) {
		File inputFile = new File("\\\\192.168.3.62\\public\\研修資料\\data.txt");
		File outputFile = new File("c:\\ocjp\\ocjpcopy_buf.txt");

		BufferedReader in = null;
		BufferedWriter out = null;


		try {
			in = new BufferedReader(new FileReader(inputFile));
			out = new BufferedWriter(new FileWriter(outputFile));

			String line;
			while((line = in.readLine())!= null) {
				out.write(line);
				out.newLine(); //改行
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
			try {
				if(out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//ひらがなを送ると文字化けするー＞文字コードの調整必要

	}

}
