/*
 * 暗黙の継承
 * あるクラスを定義するとき、extendsで親クラスを指定しなければ、
 * java.lang.Objectを親クラスをして継承したと見なされる。
 *
 * つまり以下のEmptyクラスは、
 * 以下のようなクラス定義を実質的に同じである。
 * public class Empty extends Object{}
 */
package Chapter14;

public class Java05Main {

	public static void main(String[] args) {

		Java05Empty e = new Java05Empty();
		String s = e.toString();
		System.out.println(s);
	}
}