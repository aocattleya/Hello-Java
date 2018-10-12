/*
 * サブクラスのインスタンスに対して、
 * スーパークラスのメソッドを呼び出す。
 */
package lesson5;

public class Java02_Main {

	public static void main(String[] args) {

		Java02_Car car = new Java02_Car();
		car.setName("フェラーリ");
		car.setColor("赤");

		Java02_Bicycle bicycle = new Java02_Bicycle();
		bicycle.setName("ビアンキ");
		bicycle.setColor("緑");

		System.out.println("【車の情報】");
		car.printData();

		System.out.println("=================");
		System.out.println("【自転車の情報】");
		bicycle.printData();
	}
}