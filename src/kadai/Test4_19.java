package kadai;

public class Test4_19 {
	public static void main(String[] args) {
		int x = 10;
		int y = 0;

		try {
			System.out.println(x / y);
			System.out.println(x*y);
		}catch(ArrayIndexOutOfBoundsException ee){
			System.out.println(ee+"?");
		}catch(ArithmeticException ae){
			System.out.println(ae+"!");
		}finally {
			System.out.println("block");
		}

		System.out.println(x+y);
	}

}


