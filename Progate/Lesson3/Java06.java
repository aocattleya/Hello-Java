// メソッドから他のメソッドを呼び出す。

package lesson3;

public class Java06 {

	public static void main(String[] args) {
		System.out.println(average(3, 8));
	}

	public static double average(int a, int b) {
		int total = add(a, b);
		return (double) total / 2;
	}

	public static int add(int a, int b) {
		return a + b;
	}
}