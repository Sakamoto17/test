package kadai;

import java.util.ArrayList;

public class FruitBasketMain {
	public static void main(String[] args) {

		Fruits[] fruits = {new Fruits("orange","オレンジ",90),
						   new Fruits("banana","イエロー",160),
						   new Fruits("apple","グリーン",80)};

		FruitsBasket fb = new FruitsBasket();
		fb.put(new Fruits ("orange","オレンジ",90));
		fb.put(new Fruits ("banana","イエロー",160));
		fb.put(new Fruits ("apple","グリーン",80));

		for(Fruits fruit : fruits) {
			fruit.show();
		}
	}

}
class FruitsBasket{
	private ArrayList<Fruits> fruitsList = new ArrayList<>();
	private int limit;

	public FruitsBasket(int limit) {
		this.limit = limit;
	}

	public FruitsBasket() {

	}

	public void put(Fruits fruits) {
		if(fruitsList.size() == limit) {
			System.out.println(fruits.getName() + "はもう入りません。");
			return;
		}
			System.out.println(fruits.getName()+ "が入りました。");
			fruitsList.add(fruits);
	}

	public Fruits take(int index) {
		return fruitsList.remove(index);
	}

}

class Fruit{
	private String name;
	private String color;
	private int price;

	public Fruit(String n,String c, int p) {
		name = n;
		color = c;
		price = p;
	}

	public void show() {
		System.out.println("名称："+ name + " 色: "+ color + " 価格 :"+ price +"円");
	}

	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getPrice() {
		return price;
	}

	public void putFruits() {

	}
	public void takeFruits() {

	}


}
