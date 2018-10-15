package Chapter08;

public class Java01Main {

	public static void main(String[] args) {
		// 1.勇者を生成
		Java01Hero h = new Java01Hero();
		// 2.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");

		// 3.勇者のメソッドを呼び出しておく
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
	}
}