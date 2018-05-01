package tsd;

class StaffOv{
	String name = "名無し";

	void setName(String n) {
		name = n;
	}
	String getName() {
		return name;
	}
}

class ManagerOv extends StaffOv{
	int salary = 5000000;

	int getSalary() {
		return salary;
	}

	@Override//アノテーション ラベルづけ
	String getName() {
		//再起呼び出し(実行)
		return "【マネージャー】"+ name;
	}
}

public class Sample6_4 {
	public static void main(String[] args) {
		StaffOv s1 = new StaffOv();
		System.out.println("-------- スーパークラス --------");
		System.out.println("名前: "+ s1.getName());

		System.out.println();
		ManagerOv m1 = new ManagerOv();
		System.out.println("-------- サブクラス --------");
		m1.setName("田中");
		System.out.println("名前: "+ m1.getName());
		System.out.println("給料: "+ m1.getSalary());
	}

}
