package lesson4;

public class Java06_Person {

	public String name;

	Java06_Person(String name) {
		System.out.println("インスタンスフィールドが生成されました");
		this.name = name;
	}

	public void hello() {
		System.out.println("こんにちは、私は" + this.name + "です");
	}
}