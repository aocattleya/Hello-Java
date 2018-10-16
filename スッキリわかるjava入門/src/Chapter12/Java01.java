/*
 * インターフェースの宣言
 * アクセス修飾子 interface インターフェース名{
 *
 * }
 * 条件
 * 1、全てのメソッドは抽象メソッドである
 * 2、基本的にフィールドを1つも持たない
 */
package Chapter12;

public class Java01 {

	public interface Creature {
		void run();
	}
}