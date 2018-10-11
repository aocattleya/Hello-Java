/*
 * インスタンスメソッド
 */
package lesson4;

public class Java08_Main {

	public static void main(String[] args) {

		Java08_Person person1 = new Java08_Person("Kate", "Jones", 27, 1.6, 50.0);

		System.out.println(person1.fullName());
		System.out.println(person1.age);
		System.out.println(person1.bmi());
	}
}