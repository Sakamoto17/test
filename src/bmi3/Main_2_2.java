package bmi3;

public class Main_2_2 {
	public static void main(String[] args) {
		Human2 h = new Human2("kato", 1.77, 69.5);
		System.out.println("----- BMI -----");
		System.out.println(h.getName() + "さんのBMIは" + BMI2.calc(h));
		System.out.println(BMI2.judge(h));
		System.out.println("---------------");

		System.out.println();

		Child2 c = new Child2("taro", 1.77, 69.5);
		System.out.println("----- BMI -----");
		System.out.println(c.getName() + "ちゃんのBMIは" + BMI2.calc(c));
		System.out.println(BMI2.judge(c));
		System.out.println("---------------");
	}
}

class Human2{
	private String name;
	private double height;
	private double weight;
	public static final double MAX = 25.0;
	public static final double MIN = 18.5;
//	private double max;
//	private double min;

	public Human2(String name, double height, double weight) {
		this.name  = name;
		this.height = height;
		this.weight = weight;
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

//	public void setMax(double max) {
//		max = 25.0;
//	}
//	public void setMin(double min) {
//		min = 18.5;
//	}
}

class Child2{
	private String name;
	private double height;
	private double weight;
	public static final double MAX = 18.0;
	public static final double MIN = 15.0;
//	private double max;
//	private double min;

	public Child2(String name, double height, double weight) {
		this.name  = name;
		this.height = height;
		this.weight = weight;
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

//	public void setMax(double max) {
//		max = 18.0;
//	}
//	public void setMin(double min) {
//		min = 15.0;
//	}
}

class BMI2{
	public static double calc(Human2 h) {
		return h.getWeight()/ h.getHeight() / h.getHeight();
	}

	public static String judge(Human2 h) {
		double bmi = calc(h);
		if(Human2.MAX < bmi) {
			return "太りすぎです";
		}else if (Human2.MIN < bmi) {
			return "標準です";
		}else {
			return "痩せすぎです";
		}
	}


	public static double calc(Child2 c) {
		return c.getWeight()/ c.getHeight() / c.getHeight();
	}


	public static String judge(Child2 c) {
		double bmi = calc(c);
		if(Child2.MAX < bmi) {
			return "太りすぎです";
		}else if(Child2.MIN < bmi){
			return "標準です";
		}else {
			return "痩せすぎです";
		}
	}

}














