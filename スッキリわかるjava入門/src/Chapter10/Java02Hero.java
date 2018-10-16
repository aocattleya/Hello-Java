/*
 * ゲッター
 * getterメソッドの定石
 * public 値を取り出すフィールドの型 getフィールド(){
 * 		return this.フィールド名
 * }
 *
 * セッター
 * setterメソッドの定石
 * public void setメソッド名(フィールドの型 任意の変数名){
 * 		this.フィールド名 = 任意の変数名;
 * }
 */
package Chapter10;

public class Java02Hero {
	private String name;

	// 省略

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}