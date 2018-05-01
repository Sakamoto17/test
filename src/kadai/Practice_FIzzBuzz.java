package kadai;

public class Practice_FIzzBuzz {
	public static void main(String[] args) {
		int n = 100;


		for(int x = 1; x <= n; x++) {

			System.out.print(x);
		}
			if(x % 15 == 0) {
				System.out.println("Fizz"+"　"+"Buzz");
			}else if(x % 5 == 0) {
				System.out.println("Buzz");
			}else if(x % 3 == 0){
				System.out.println( "Fizz");
			}else {
				System.out.println(x);
			}
	}

}


