package kadai;

import java.util.ArrayList;

public class MainGames {
	public static void main(String[] args) {
		// 配列宣言

//		Game[]games ; new Game [3];
//
//		games[0] = new Game("スプラトゥーン2", "アクションシューティング", 712);
//		games[1] = ("モンスターハンターワールド", "アクションロールプレイングゲーム", 936);
//		games[2] = ("ドラゴンクエストⅪ","ロールプレイングゲーム",317);

		ArrayList<Game> games = new ArrayList <>();


		games.add(new Game ("スプラトゥーン2", "アクションシューティング", 712));
		games.add(new Game("モンスターハンターワールド", "アクションロールプレイングゲーム", 936));
		games.add(new Game("ドラゴンクエストⅪ","ロールプレイングゲーム",317));


		for(int i = 0; i < games.size(); i++) {
				games.get(i).show();
		}

	}

}

class Game{
	String name;
	String type;
	int sale;

	public Game(String n, String t, int s) {
		name = n;
		type = t;
		sale = s;
	}

	public void show() {
		System.out.println("ゲーム名 :"+ name + "、ジャンル :" + type + "、販売本数 :"+ sale + "万");
	}
}
