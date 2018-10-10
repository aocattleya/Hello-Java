// メソッドのオーバーロード

package lesson3;

public class Java05 {

	public static void main(String[] args) {
		hello();
		hello("Bob");
	}

	public static void hello() {
		System.out.println("こんにちは世界");
	}

	public static void hello(String name) {
		System.out.println("こんにちは" + name + "さん");
	}
}