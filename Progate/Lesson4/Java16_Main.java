/*
 * セッター
 * 分からない最初のうちは、フィールドはprivateに,メソッドはpublicに。
 */
package lesson4;

public class Java16_Main {

	public static void main(String[] args) {
		Java16_Person person1 = new Java16_Person("Kate", "Jones", 27, 1.6, 50.0);
		person1.printData();
		Java16_Person person2 = new Java16_Person("John", "Christopher", "Smith", 65, 1.75, 80.0);
		person2.printData();

		System.out.println("----------------------");
		// person1のmiddleNameフィールドの値を「Claire」に
		person1.setMiddleName("Claire");

		System.out.println("ミドルネームを" + person1.getMiddleName() + "に変更しました");
		person1.printData();
	}
}