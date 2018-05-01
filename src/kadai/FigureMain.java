package kadai;

public class FigureMain {
	public static void main(String[] args) {

		Circle c1 = new Circle(10);
			System.out.println("この円の面積は"+ c1 .getArea() + "です。");

		Square s1 = new Square(10);
			System.out.println("この正方形の面積は"+ s1.getArea() +"です。");

		Circle circle = new Circle(5.0);
		Cylinder c = new Cylinder(10,circle);
		System.out.println("この円柱の体積は"+c.getVolume()+ "です。");
	}
}

class Circle{
	private double radius;
	private double area;

	public  Circle(double r) {
		radius = r; //コンストラクタ
	}

	public void setRadius(double r) {
		radius = r; //セッター
	}

	public double getRadius() {
		return radius; //ゲッター
	}

	public double getArea(){
		double area = radius * radius * 3.14; //double area =が欠落
		return area ;
	}
}

class Square{
	private double sides;
	private double area;

	public Square(double s) {
		sides = s;
	}
	public void setSquare(double s) {
		sides = s;
	}
	public double getSquare() {
		return area;
	}

	public double getArea() {
		double area = sides * sides;
		return area;
	}
}

class Cylinder{
	private double height;
	private Circle circle;  //	Circle circle→circleの部分を属性として持っている。

	public Cylinder(double h,Circle c) {
		height = h;
		circle = c;
	}

	public Cylinder(double h) {
		height = h;
	}
	public void setCylinder(double h) {
		height = h;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle c) {
		circle = c;
	}

	public double getVolume() {
		return circle.getArea() * height;
	}

}//ちゃんとクラスごとに閉じられているか、数とインデントが正しいかを確認！