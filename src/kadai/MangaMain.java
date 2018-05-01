package kadai; //入力ミスでエラーになっていること多し、気を付ける
public class MangaMain {
	public static void main(String[] args) {
		Manga m = new Manga("漫画",400);
		Novel n = new Novel("小説",600);

		System.out.println("タイトル:"+ m.getTitle() + "価格:"+ m.getPrice());
		m.showRead();
		m.showWatch();

		System.out.println("タイトル:"+ n.getTitle() + "価格:"+ n.getPrice());
		n.showRead();
		n.showImagine();
	}

}

class Book{

	protected String title;
	protected int price;

//	public void setBook(String title,int price) { //セッター
//		title = this.title;
//		price = this.price;
//	}
	public Book(String title, int price) { //コンストラクタ
		this.title = title;
		this.price = price;
	}

	public void  setTitle(String title) { //セッター
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}


	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}


//	public void showTitle() {
//		System.out.println("作品名:");
//	}
//
//	public void showPrice() {
//		System.out.println("価格:");
//	}

	public void showRead() {
		System.out.println("読む");
	}

}

class Manga extends Book{

	public Manga(String title, int price) {
		super(title,price);
	}

	public void showWatch() {
		System.out.println("見る");
	}

}

class Novel extends Book{

	public Novel(String title, int price) {
		super(title,price);
	}

	public void showImagine() {
		System.out.println("想像する");
	}

}
