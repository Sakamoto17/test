package tsd;

import java.util.HashMap;

public class Rensyu0427 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>(); //HashMap
		//ArrayListと書き方は似ている
				//Key   //Value = Data
	}
}

class Flower{
	String name;
	int price;
	int type;

	@Override
	public boolean equals(Object obj) {
		Flower f = (Flower)obj;
		return name.equals(f.name) && price == f.price;  //上手い実装の例？
	}

	@Override
	public int hashCode() {  //Hashcode 実装？
		return name.hashCode()% price + type;
	}
}

