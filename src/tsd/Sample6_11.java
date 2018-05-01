package tsd;

interface MyInterface{
	//public static final
	int a = 10;
	public void getComment();
}

interface SubInterface extends MyInterface{
	// public abstract
	int getSum();
}

class C implements SubInterface{

	@Override
	public void getComment() {
		System.out.println("スーパーインターフェースを実装する。");
	}
	@Override
	public int getSum() {
		return (a + 5);
	}
}

public class Sample6_11 {
	public static void main(String[] args) {
		C c1 = new C();
		c1.getComment();
		System.out.println(c1.getSum());
	}
	
	
	

}
