package Chapter15;

import java.io.FileWriter;
import java.io.IOException;

public class Java02 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
		} catch (IOException e) {
			System.out.println("エラーが発生しました。");
		}
	}
}