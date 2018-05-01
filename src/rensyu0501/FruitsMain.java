package rensyu0501;

public class FruitsMain {
	public static void main(String[] args) {

		Fruits[] fruits= {new Fruits("orange", "orange",180),
						 new Fruits("banana", "yellow", 120),
						 new Fruits("apple", "red",130)};

		for(Fruits fruit:fruits) {
			fruit.show();
		}
	}
}

class Fruits{
	private String name;
	private String color;
	private int price;

	Fruits (String name, String color, int price){
		this.name = name;
		this.color = color;
		this.price = price;
	}


	public void show() {
		System.out.println("名前: "+ name + " 色: "+ color+ " 値段: "+ price);
	} //showメソッド

	public String getName() {                     //ゲッター
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}

}
