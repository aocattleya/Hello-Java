/*
 * 戻り値の利用
 *
 * 値の戻し方
 * public static 戻り値の型 メソッド名(引数リスト…){
 * 		メソッドが呼び出された時に動く処理
 * 		return 戻り値;
 * }
 */
package Chapter05;

public class Java06 {

	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}

	public static void main(String[] args) {
		int ans = add(100, 10);
		System.out.println("100 + 10 =  " + ans);
	}
}