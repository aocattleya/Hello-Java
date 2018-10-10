// 数字の入力を受け取る

package lesson3;

import java.util.Scanner;

public class Java15 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("年齢：");

		int age = scanner.nextInt();
		System.out.print("体重：");

		double weight = scanner.nextDouble();
		System.out.println("あなたの年齢は" + age + "歳です");
		System.out.println("あなたの体重は" + weight + "kgです");
	}
}