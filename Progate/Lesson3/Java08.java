// 真偽値を返す

package lesson3;

public class Java08 {

	public static void main(String[] args) {
		int number = 9;
		if (isEven(number)) {
			System.out.println(number + "は偶数です");
		} else {
			System.out.println(number + "は奇数です");
		}
	}

	public static boolean isEven(int a) {
		return a % 2 == 0;
	}
}