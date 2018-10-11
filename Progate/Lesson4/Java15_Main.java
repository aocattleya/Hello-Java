/*
 * カプセル化
 * ゲッター
 */
package lesson4;

public class Java15_Main {

	public static void main(String[] args) {
		Java15_Person person1 = new Java15_Person("Kate", "Jones", 27, 1.6, 50.0);
		person1.printData();

		Java15_Person person2 = new Java15_Person("John", "Christopher", "Smith", 65, 1.75, 80.0);
		person2.printData();

		System.out.println("----------------------");
		// person2に対して、getMiddleNameメソッドを呼び出す。
		System.out.println("person2のミドルネームは" + person2.getMiddleName() + "です");
	}
}