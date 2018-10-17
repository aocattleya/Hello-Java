/*
 * 「6つのint値」からDateインスタンスを生成する
 * Calendar c = Calendar.getInstance();
 * c.set(年, 月, 日, 時, 分, 秒); またはc.set(Calemdar.〜, 値);
 * Date d = c.getTime();
 * (〜には、YEAR、MONTH、DAY_OF_MONTH、HOUR、MINUTE、DAYなどを指定する)
 *
 * Dateインスタンスから「6つのint値」を生成する
 * Calendar c = Calendar.getInstance();
 * c.setTime(d);   // dはDate型変数
 * int year = c.get(Calendar.YEAR);
 * int month = c.get(Calendar.MONTH);
 * int hour = c.get(Calendar.DAY_OF_MONTH);
 * int minute = c.get(Calendar.HOUR);
 * int second = c.get(Calendar.SECOND);
 */
package Chapter14;

import java.util.Calendar;
import java.util.Date;

public class Java03 {

	public static void main(String[] args) {

		// 現在の年を表示する
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");

		// 指定した日のDate型の値を得る
		c.set(2010, 8, 22, 1, 23, 45);
		c.set(Calendar.YEAR, 2011);
		@SuppressWarnings("unused")
		Date past = c.getTime();
	}
}