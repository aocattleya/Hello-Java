// インスタンスフィールドの定義

package lesson4;

public class Java03_Main {

	public static void main(String[] args) {
		Java03_Person person1 = new Java03_Person();

		person1.hello();
		person1.name = "Kate Jones";
		System.out.println(person1.name);


		Java03_Person person2 = new Java03_Person();

		person2.hello();
		person2.name = "John Christopher Smith";
		System.out.println(person2.name);

	}
}