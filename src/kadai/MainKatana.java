package kadai;

import java.util.ArrayList;

public class MainKatana {
	public static void main(String[] args) {

		ArrayList<Katana>swords = new ArrayList<>();

		swords.add(new Katana("大包平", "太刀", "オオカネヒラ"));
		swords.add(new Katana("鬼切丸", "太刀","オニキリマル"));
		swords.add(new Katana("和泉守兼定", "打刀","イズミノカミカネサダ"));

		for(int i = 0; i < swords.size(); i++) {
				swords.get(i).show();  //メソッドチェーン（使えるように！）
		}

	}



}

class Katana{
	String name;
	String type;
	String kana;

	 Katana(String n, String t, String k){
		name = n;
		type = t;
		kana = k;
	}

	 void show() {
		System.out.println("名前：" + name + " 種類 :"+ type + " 読み仮名 :" + kana);
	}

}
