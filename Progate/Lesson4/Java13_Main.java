/*
 * thisを用いてコンストラクタを呼び出す
 */
package lesson4;

public class Java13_Main {

	public static void main(String[] args) {
		Java13_Person person1 = new Java13_Person("Kate", "Jones", 27, 1.6, 50.0);
		person1.printData();

		Java13_Person person2 = new Java13_Person("John", "Christopher", 65, 1.75, 80.0);
		person2.printData();

		Java13_Person.printCount();
	}
}