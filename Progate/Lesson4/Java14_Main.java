/*
 * fullNameメソッドの中で、middleNameがnullかどうかによって返す値を変える
 */
package lesson4;

public class Java14_Main {

	public static void main(String[] args) {
		Java14_Person person1 = new Java14_Person("Kate", "Jones", 27, 1.6, 50.0);
		person1.printData();
		Java14_Person person2 = new Java14_Person("John", "Christopher", "Smith", 65, 1.75, 80.0);
		person2.printData();

		Java14_Person.printCount();
	}
}