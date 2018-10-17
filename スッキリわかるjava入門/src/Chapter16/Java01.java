/*
 * Webページを習得する
 */
package Chapter16;

import java.io.InputStream;
import java.net.URL;

public class Java01 {

	public static void main(String[] args) throws Exception {
		URL u = new URL("https://github.com/aocattleya");
		InputStream is = u.openStream();
		int i = is.read();

		while (i != -1) {
			char c = (char) i;
			System.out.print(c);
			i = is.read();
		}
	}
}