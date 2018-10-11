/*
 * コンストラクタのオーバーロード
 * コンストラクタの重複はよくないので次で解消する
 */
package lesson4;

public class Java12_Main {

	public static void main(String[] args) {
		Java12_Person person1 = new Java12_Person("Kate", "Jones", 27, 1.6, 50.0);
		person1.printData();

		Java12_Person person2 = new Java12_Person("John", "Christopher", "Smith", 65, 1.75, 80.0);
		person2.printData();

		Java12_Person.printCount();
	}
}