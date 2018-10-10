/*
 * this
 * thisはクラス内のメソッドの定義の中でのみ使用できます。
 * メソッドが呼ばれた時に、そのメソッドを呼び出しているインスタンスに置き換えられる。
 */

package lesson4;

public class Java04_Main {

	public static void main(String[] args) {
		Java04_Person person1 = new Java04_Person();
		person1.name = "Kate Jones";
		person1.hello();

		Java04_Person person2 = new Java04_Person();
		person2.name = "John Christopher Smith";
		person2.hello();

	}
}