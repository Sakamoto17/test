package tsd;

abstract class School{
	String name;
	void getName() {
		System.out.println("school 名前：" + name);

	}
	public void setName(String n) {
		name = n;
	}
}

class Students extends School{
	@Override //スーパークラスからの継承が途絶えると、ただの宣言に
	void getName() {
		System.out.println("student名前 : "+ name);
	}
}

public class Sample6_14 {
	public static void main(String[] args) {
		//型変換？
		School s1 = new Students();
		s1.setName("山田");
		s1.getName();
	}

}
