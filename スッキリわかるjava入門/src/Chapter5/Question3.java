package Chapter5;

public class Question3 {

	public static void main(String[] args) {
		String address = "a-more@yapon.co.jp";
		String text = "来週は飲み会があります、しかし私はお酒が飲めません。";
		email(address, text);
	}

	public static void email(String title, String address, String text) {
		System.out.println("「" + address + "」に、以下のメールを送信しました");
		System.out.println("件名：「" + title + "」");
		System.out.println("本文：「" + text + "」");
	}

	public static void email(String address, String text) {
		System.out.println("「" + address + "」に、以下のメールを送信しました");
		System.out.println("件名：無名");
		System.out.println("本文：「" + text + "」");
	}
}