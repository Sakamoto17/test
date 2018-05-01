package kadai;

public class FruitsMain {   //ゲッターがない
	public static void main(String[] args) {

		Fruits[] fruits = {new Fruits("orange","オレンジ",90),
						   new Fruits("banana","イエロー",160),
						   new Fruits("apple","グリーン",80)};

		for(Fruits fruit : fruits) {
			fruit.show();
		}
	}

}

class Fruits{
	private String name;
	private String color;
	private int price;

	public Fruits(String n,String c, int p) {
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

class FruitsBascket{
	public void put() {

		}
	}


}
