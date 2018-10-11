package lesson4;

public class Java07_Person {

	// インスタンスフィールドを定義
	public String firstName;
	public String lastName;
	public int age;
	public double height;
	public double weight;

	// コンストラクタを定義し、インスタンスに値をセット
	Java07_Person(String firstName, String lastName, int age, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
}