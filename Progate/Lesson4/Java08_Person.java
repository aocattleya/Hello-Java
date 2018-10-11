package lesson4;

public class Java08_Person {
	public String firstName;
	public String lastName;
	public int age;
	public double height;
	public double weight;

	public Java08_Person(String firstName, String lasName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lasName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String fullName() {
		return this.firstName + " " + this.lastName;
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}
}