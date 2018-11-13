package Chapter01;

public class Java03 {
	public static void main(String[] args) {

		String s1 = "Java programming";

		// 指定位置から始まる文字列を任意の長さだけ切り出す
		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));

		System.out.println("文字列s1の4~7文字目は" + s1.substring(3, 8));
	}
}