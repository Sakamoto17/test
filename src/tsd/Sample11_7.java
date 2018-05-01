package tsd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal2 implements Serializable{
	Animal2(){
		System.out.println("Animal()");
	}
}

class Dog extends Animal2{
	Dog() {
		System.out.println("Dog()");
	}
}
class Bulldog extends Dog{}


public class Sample11_7 {
	public static void main(String[] args) {
		String File;
		FileOutputStream fos;
		ObjectOutputStream oos;
		Object obj = null;
		try {
			fos = new FileOutputStream(new File("dog.txt"));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

//		FileInputStream fis = new FileInputStream(oos);
//		ObjectInputStream ois = new ObjectInputStream(fis);

	}

}

