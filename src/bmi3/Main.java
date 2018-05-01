package bmi3;

public class Main {
	public static void main(String[] args) {
		Human h = new Human("kato", 1.77, 69.5);
		System.out.println("----- BMI -----");
		System.out.println(h.getName() + "さんのBMIは" + BMI.calc(h));
		System.out.println(BMI.judge(h));
		System.out.println("---------------");

		System.out.println();

		Child c = new Child("taro", 1.77, 69.5);
		System.out.println("----- BMI -----");
		System.out.println(c.getName() + "ちゃんのBMIは" + BMI.calc(c));
		System.out.println(BMI.judge(c));
		System.out.println("---------------");
	}
}

interface Basic{
	public String name;  //初期化しないと使えない?
	public double height;
	public double weight;
	public double max;
	public double min;

	public String setName();
	public double getHeight();
	public double getWeight();
	public double getMax();
	public double getMin();
}

class Human implements Basic{

	public Human(String name,double height,double weight,double max, double min) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.max = max;
		this.min = min;
	}

	public void setName() {
		this.name = name;
	}
//	super(name,height,weight,25,18.5);

	public void getName();
	public void getHeight();
	public void getWeight();
	public void getMax();
	public void getMin();




}
class Child implements Basic{

//	public Child(String name,double height,double weight) {
//		super(name,height,weight,18,15);
//	}
}

class BMI{
//	public static double calc(Basic b){
//		return b.getWeight()/b.getHeight()/b.getHeight();
//	}
//
//	public static String judge(Basic b) {
//		double bmi = calc(b);
//		if(b.getMax() < bmi ) {
//			return "太りすぎです";
//		}else if(b.getMin() <= bmi) {
//			return "標準です";
//		}else {
//			return "痩せすぎです";
//		}
	}




}
