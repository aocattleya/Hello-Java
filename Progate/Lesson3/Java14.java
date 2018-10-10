/*
 * コンソールへの入力とScanner
 * Scannerで文字列を受け取る
 */

package lesson3;

import java.util.Scanner;

public class Java14 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("あなたの名前：");
		String name = scanner.next();

		System.out.println("あなたの名前は" + name + "です");
	}
}