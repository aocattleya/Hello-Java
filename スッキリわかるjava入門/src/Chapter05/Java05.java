/*
 * 引数の例（渡す値が複数の場合）
 */
package Chapter05;

public class Java05 {

	public static void main(String[] args) {
		add(100, 20);
		add(200, 50);
	}

	// 複数の値を受け取るメソッド
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
}