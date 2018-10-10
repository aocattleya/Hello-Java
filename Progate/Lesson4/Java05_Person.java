package lesson4;

public class Java05_Person {
	public String name;

	Java05_Person(){
		System.out.println("インスタンスが生成されました");
	}

	public void hello() {
		System.out.println("こんにちは、私は" + this.name + "です");
	}
}