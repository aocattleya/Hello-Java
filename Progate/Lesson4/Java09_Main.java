/*
 * printDataメソッドを定義
 *
 * 結果
 * 私の名前はKate Jonesです
 * 年齢は27歳です
 * BMIは20です
 */
package lesson4;

public class Java09_Main {

	public static void main(String[] args) {
		Java09_Person person1 = new Java09_Person("Kate", "Jones", 27, 1.6, 50.0);
		person1.printData();
	}
}