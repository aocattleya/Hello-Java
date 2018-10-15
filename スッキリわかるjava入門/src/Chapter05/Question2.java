package Chapter05;

public class Question2 {

	public static void main(String[] args) {
		String title = "来週の件";
		String address = "a-more@yapon.co.jp";
		String text = "来週は飲み会があります、しかし私はお酒が飲めません。";
		email(title, address, text);
	}

	public static void email(String title, String address, String text) {
		System.out.println("「" + address + "」に、以下のメールを送信しました");
		System.out.println("件名：「" + title + "」");
		System.out.println("本文：「" + text + "」");
	}
}