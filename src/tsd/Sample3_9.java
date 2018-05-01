package tsd;

public class Sample3_9 {
	public static void main(String[] aegs) {
		for(int i = 0; i < 9; i++) {
			for (int j = 0; j <9; j++){
				int k = (i + 1 )*(j + 1);
				if(k < 10) {
					System.out.print("  "+ k);
				}else {
					System.out.print("  " + k);

				}
			}
			System.out.println();
		}
	}
}
