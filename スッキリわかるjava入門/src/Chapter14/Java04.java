// SimpleDateFormatを用いて指定した形式で日付情報を表示するコード例
package Chapter14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Java04 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {

		// 本日の日時を表示する
		Date now = new Date();
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String s = f.format(now);
		System.out.println(s);

		// 指定日時の文字列を解析しDate型として得る
		Date d = f.parse("2011/09/22 01:23:45");
	}
}