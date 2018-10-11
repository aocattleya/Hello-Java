/*
 * クラスメソッドを用いて合計人数を出力する
 */
package lesson4;

public class Java11_Main {

	public static void main(String[] args) {
		Java11_Person person1 = new Java11_Person("Kate", "Jones", 27, 1.6, 50.0);
		person1.printData();

		Java11_Person person2 = new Java11_Person("john", "Smith", 65, 1.75, 80.0);
		person2.printData();

		Java11_Person.printCount();
	}
}