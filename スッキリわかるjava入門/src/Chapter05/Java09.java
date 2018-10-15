/*
 *  配列が引数
 */
package Chapter05;

public class Java09 {

	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		printArray(array); // 引数を渡す
	}
}