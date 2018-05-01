package bmi2;

public class Main_2 {
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

abstract class Basic{
	private double max;
	private double min;
	private String name;
	private double height;
	private double weight;

	public Basic(String name,double height,double weight, double max,double min) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.max = max;
		this.min = min;
	}

	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public double getMax() {
		return max;
	}
	public double getMin() {
		return min;
	}
}

class Human extends Basic{

	public Human(String name,double height,double weight) {
		super(name,height,weight,25,18.5);
	}
}

class Child extends Basic{

	public Child(String name,double height,double weight) {
		super(name,height,weight,18,15);
	}
}

class BMI{
	public static double calc(Basic b){
		return b.getWeight()/b.getHeight()/b.getHeight();
	}

	public static String judge(Basic b) {
		double bmi = calc(b);
		if(b.getMax() < bmi ) {
			return "太りすぎです";
		}else if(b.getMin() <= bmi) {
			return "標準です";
		}else {
			return "痩せすぎです";
		}
	}

}
