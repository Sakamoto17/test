package tsd;

public class Sample8_1 {
	public static void main(String[] args) {
		String ext = "From external class";

		MyTopLevel mt = new MyTopLevel();//外部クラスのインスタンス化

		mt.createNested();//外部クラスのメソッド呼び出し

		MyTopLevel.MyInner inner = mt.new MyInner();//外部クラスが持つネストクラスのインスタンス化

		inner.accessInner(ext);//ネストクラスの呼び出し

	}

}

class MyTopLevel{//外部クラス

	private String top = "From Top Level class";
	MyInner minn = new MyInner();

	public void createNested() {
		//ネストクラスのメソッド呼び出し
		minn.accessInner(top);
	}
	//インスタンスなネストクラスの定義
	class MyInner{

		public void accessInner(String st) {
			System.out.println(st);
		}
	}
 }

