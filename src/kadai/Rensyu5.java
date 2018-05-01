package kadai;

public class Rensyu5 {
	public static void main(String[] args) {
		int n = 100;
		for(int x = 1; x <= n; x++)
			if(x % 3 ==0 && x % 5 == 0) {
				System.out.println(x + "Fizz"+"　"+"Buzz");
			}else if(x % 5 == 0) {
				System.out.println(x + "Buzz");
			}else if(x % 3 == 0){
				System.out.println(x + "Fizz");
			}else {
				System.out.println(x);
			}
	}

}
