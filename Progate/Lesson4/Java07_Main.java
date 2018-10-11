/*
 * フィールドとコンストラクタ
 */
package lesson4;

public class Java07_Main {

	public static void main(String[] args) {
		Java07_Person person1 = new Java07_Person("kete", "jones", 27, 1.6, 50.0);

		System.out.println(person1.firstName);
		System.out.println(person1.lastName);
		System.out.println(person1.age);
		System.out.println(person1.height);
		System.out.println(person1.weight);
	}
}