/*
 * 門3と同時（3秒間の待ち時間を入れる）
 */
package Chapter06;

public class Question1Kouhan {
	public static void callDeae() {
		System.out.println("ええい、こしゃくな。くせ者だ！であえい！");
	}

	public static void showMondokoro() throws Exception {
		System.out.println("飛車さん、角さん。もういいでしょう。");
		System.out.println("この紋所が目に入らぬか！");
		Thread.sleep(3000);
		Quastion1Zenhan.doTogame();
	}
}