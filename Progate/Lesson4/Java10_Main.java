/*
 * クラスフィールドを使ってインスタンスの生成回数を数える
 */
package lesson4;

public class Java10_Main {

	public static void main(String[] args) {
		Java10_Person person1 = new Java10_Person("Kate", "Jones", 27, 1.6, 50.0);
		person1.printData();

		Java10_Person person2 = new Java10_Person("John", "Smith", 65, 1.75, 80.0);
		person2.printData();

		System.out.println("合計" + Java10_Person.count + "人です");
	}
}
/*
 * 結果
 * 私の名前はKate Jonesです
 * 年齢は27歳です
 * BMIは20です
 * 私の名前はJohn Smithです
 * 年齢は65歳です
 * BMIは26です
 * 合計2人です
 */