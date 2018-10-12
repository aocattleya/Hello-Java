/*
 * mainメソッド以外からメソッドを呼び出す
 */
package Chapter5;

public class Java03 {

	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}

	public static void methodB() {
		System.out.println("methodB");
	}

	public static void main(String[] args) {
		methodA();
	}
}