/*
	メソッドに引数を渡す
	結果：Bobさんこんにちは
*/

package lesson3;

public class Java02 {

	public static void main(String[] args) {
		hello("Bob");
	}

	public static void hello(String name) {
		System.out.println(name + "さんこんにちは");
	}
}