/*
 * Javaで日時の情報を扱う場合に最も利用される形式
 */
package Chapter14;

import java.util.Date;

public class Java02 {

	public static void main(String[] args) {

		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());

		Date past = new Date(1316622225935L);
		System.out.println(past);
	}
}