package kadai;

class Animal{
	private int age;

	public void setAge(int a) {
		age = a;
	}

	public Animal(int a) {
		age = a;
	}			//dog,catのデフォルトコンストラクタができなくなった
				//→ここで一回作っちゃったから、他も自分で作る


	public int getAge() {
		return age;
	}

	public void showWalk() {
		System.out.println("歩く");
	}
}

class Dogs extends Animal{

	public void showBite() {
		System.out.println("噛みつく");
	}

	public Dogs(int a) {  //親クラスで作ったから、こっちにも作る
		super(a);
	}
}

class Cats extends Animal{

	public void showScratch() {
		System.out.println("ひっかく");
	}

	public Cats(int a) {  //Dogと同じ
		super(a);
	}
}


public class DogCatMain {
	public static void main(String[] args) {
		Dogs d = new Dogs(2);
		Cats c = new Cats(1);

		d.showWalk();
		d.showBite();

		c.showWalk();
		c.showScratch();
	}

}
