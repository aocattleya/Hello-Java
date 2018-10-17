package Chapter15;

public class Question2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			// APIリファレンスから送出例外を調べる
			int i = Integer.parseInt("三");
		} catch (NumberFormatException e) {
			System.out.println("例外NumberFormatEcxeptionをcatchしました");
		}
	}
}