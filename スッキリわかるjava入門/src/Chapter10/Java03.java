/*
 * setterメソッドの中で値の妥当性をチェックする
 */
package Chapter10;

@SuppressWarnings("unused")
public class Java03 {

	private String name;

	private void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前がnullである。処理を中断。");
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
		}
		if (name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎる。処理を中断");
		}
		this.name = name;
	}
}