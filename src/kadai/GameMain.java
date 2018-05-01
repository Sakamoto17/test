package kadai;

public class GameMain {
	public static void main(String[] args) {
		Yusya y = new Yusya(500,250,100);
		Magician m = new Magician(200,700,80);


		System.out.println("勇者のＨＰは"+ y.getHP() +" ＭＰは"+y.getMP()+" 勇気は"+y.getBrave());
		y.showAttack();
		y.showMA();

		System.out.println("魔法使いのＨＰは"+ m.getHP() +" ＭＰは"+m.getMP()+" 魔法攻撃力は"+m.getMAttack());
		m.showMA();
		m.showRest();
	}

}

class Adventurer{
	private int HP;
	private int MP;

	//コンストラクタをつくる 共通部分のみ
	public Adventurer(int HP,int MP) { //コンストラクタにvoidはいらない
		this.HP = HP;
		this.MP = MP;
	}
	//セッター
	public void MAttack(int HP) {
		this.HP = HP;
	}
	public void setMP(int MP) {
		this.MP = MP;
	}


	//ゲッター
	public int getHP() {
		return HP;
	}
	public int getMP() {
		return MP;
	}


	//共通部分
	public void showMA() {
		System.out.println("魔法で攻撃");
	}
}

class Yusya extends Adventurer{
	//super

	private int Brave;

	public Yusya(int HP, int MP, int Brave) {
		super(HP,MP);
		this.Brave = Brave;
	}

	public void showAttack() { //〇show ×void Yusha
		System.out.println("武器で攻撃");
	}

	public void setBrave(int Brave) {  //共通していない部分はここで作る
		this.Brave = Brave;
	}

	public int getBrave() {
		return Brave;
	}

}
class Magician extends Adventurer{

	private int MAttack;

	public Magician(int HP, int MP,int MAttack) {
		super(HP,MP);
		this.MAttack = MAttack;
	}
	public void showRest() { //〇show ×void Magician
		System.out.println("休む");
	}
	public void setMAttack(int MAttack) {
		this.MAttack = MAttack;
	}
	public int getMAttack() {
		return MAttack;
	}
}
