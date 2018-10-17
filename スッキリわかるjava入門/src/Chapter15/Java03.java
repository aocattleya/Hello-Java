/*
 * ざっくりと例外を捕捉する
 */
package Chapter15;

import java.io.FileWriter;

public class Java03 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");
		} catch (Exception e) {
			System.out.println("エラーです");
		}
	}
}