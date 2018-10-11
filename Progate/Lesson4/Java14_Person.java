package lesson4;

public class Java14_Person {
	public static int count = 0;
	public String firstName;
	public String middleName;
	public String lastName;
	public int age;
	public double height;
	public double weight;

	Java14_Person(String firstName, String lastName, int age, double height, double weight) {
		Java14_Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	Java14_Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
		this(firstName, lastName, age, height, weight);
		this.middleName = middleName;
	}

	public String fullName() {
		// 以下を、middleNameがない場合とある場合で条件分岐
		if (middleName == null) {
			return this.firstName + " " + this.lastName;
		} else {
			return this.firstName + " " + this.middleName + " " + this.lastName;
		}
	}

	public void printData() {
		System.out.println("私の名前は" + this.fullName() + "です");
		System.out.println("年齢は" + this.age + "歳です");
		System.out.println("身長は" + this.height + "mです");
		System.out.println("体重は" + this.weight + "kgです");
		System.out.println("BMIは" + Math.round(this.bmi()) + "です");
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public static void printCount() {
		System.out.println("合計" + Java14_Person.count + "人です");
	}
}
