package tsd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal4 {
	Animal4(){ System.out.println("Animal()");}
}

class Dog4 extends Animal4 implements Serializable{
	Dog4() {System.out.println("Dog()");}
}

class BullDog extends Dog4{}

public class Sample11_6_2 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null ;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		BullDog obj = new BullDog();

		try {
			fos = new FileOutputStream(new File("dog.txt"));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			System.out.println("シリアライズ完了");

			fis = new FileInputStream(new File("dog.txt"));
			ois = new ObjectInputStream(fis);
			BullDog readObj = (BullDog)ois.readObject();
			System.out.println("デシリアライズ完了");
		}catch(ClassNotFoundException e) {
			System.out.println("クラスファイルがありません");
		}catch(FileNotFoundException e) {
			System.out.println("ファイルがありません");
		}catch(IOException e){
			System.out.println("IO Error");
		}finally {
			try {
				oos.close();
				ois.close();
		}catch(IOException e) {
			}
		}
	}

}
