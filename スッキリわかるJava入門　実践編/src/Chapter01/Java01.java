package Chapter01;

public class Java01 {
	public static void main(String[] args) {

		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";

		// 内容が等しいか調べる
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}

		// 大文字小文字区別せずに内容が等しいか調べる
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}

		// 文字列長を調べる
		System.out.println("s1の長さは" + s1.length() + "です");

		// 空文字かを調べる
		if (s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}
	}
}