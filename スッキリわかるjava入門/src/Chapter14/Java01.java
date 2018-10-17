/*
 * long型の数値
 */
package Chapter14;

public class Java01 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		// ここで何らかの時間のかかる処理

		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は…" + (end - start) + "ミリ秒でした");
	}
}