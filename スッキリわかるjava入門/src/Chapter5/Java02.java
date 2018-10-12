/*
 * メソッドの呼び出し
 *
 * メソッド名(引数リスト)
 */
package Chapter5;

public class Java02 {

	public static void name() {
		System.out.println("メソッドを呼び出します");
		hello();
		System.out.println("メソッドの呼び出しが終わりました");
	}

	public static void hello() {
		System.out.println("湊さん、こんにちは");
	}
}