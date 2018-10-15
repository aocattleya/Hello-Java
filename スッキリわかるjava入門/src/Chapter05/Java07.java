/*
 * オーバーロード（引数の型が異なる場合）
 */
package Chapter05;

public class Java07 {

	// １つ目のメソッド
	public static int add(int x, int y) {
		return x + y;
	}

	// ２つ目のメソッド
	public static double add(double x, double y) {
		return x + y;
	}

	// ３つ目のメソッド
	public static String add(String x, String y) {
		return x + y;
	}

	public static void main(String[] args) {

		System.out.println(add(10, 20));
		System.out.println(add(3.5, 2.7));
		System.out.println(add("Hello()", "World"));
	}
}