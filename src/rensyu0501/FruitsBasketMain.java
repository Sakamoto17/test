package rensyu0501;

import java.util.ArrayList;
import java.util.List;

public class FruitsBasketMain {
	public static void main(String[] args) {
		FruitsBasket fb = new FruitsBasket(3);  //Basketの大きさ決定

		Fruits f1 = new Fruits("orange", "orange",180);
		Fruits f2 =	new Fruits("banana", "yellow", 120);
		Fruits f3 =	new Fruits("apple", "red",130);

		Fruits f4 =	new Fruits("peach", "pink",130);

		fb.put(f1);
		fb.put(f2);
		fb.put(f3);

		fb.put(f4);

		Fruits f5 = fb.take(0);
	}
}

class FruitsBasket{
	private List<Fruits> basket = new ArrayList<Fruits>();
	private int limit;

	public FruitsBasket(int limit) {
		this.limit = limit;
	}

	public void put(Fruits fruits) {  //入れる
		if(basket.size() >= limit) {
			System.out.println("バスケットはいっぱいです。");
			return;
		}
		basket.add(fruits);
	}

	public Fruits take (int index) {  //取り出す
		return basket.remove(index);
	}






//	private String name;
//	private String color;
//	private int price;
//
//	FruitsBasket (String name, String color, int price){
//		this.name = name;
//		this.color = color;
//		this.price = price;
//	}
//
//	public void put() {
//		System.out.println("フルーツがバスケットに入りました。");
//	}
//
//	public void show() {
//		System.out.println("名前: "+ name + " 色: "+ color+ " 値段: "+ price);
//	} //showメソッド
//
//	String getName() {                     //ゲッター
//		return name;
//	}
//
//	String getColor() {
//		return color;
//	}
//
//	int getPrice() {
//		return price;
//	}

}
