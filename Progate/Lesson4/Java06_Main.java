/*
 * フィールドに値をセットする
 * コンストラクタに情報を渡す
 * コンストラクタでフィールドをセットする
 */
package lesson4;

public class Java06_Main {

	public static void main(String[] args) {
		Java06_Person person1 = new Java06_Person("Kate Jones");
		person1.hello();

		Java06_Person person2 = new Java06_Person("john Christopher Smith");
		person2.hello();
	}
}