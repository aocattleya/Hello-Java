package Chapter14;

public class QuestionAccount {

	String accountNumber;
	int balance;

	// ① 文字列表現のメソッド
	public String toString() {
		return "¥¥" + this.balance + "（口座番号：" + this.accountNumber + "）";
	}

	// ② 投下判定のメソッド
	public boolean wquals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof QuestionAccount) {
			QuestionAccount a = (QuestionAccount) o;
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();
			if (an1.equals(an2)) {
				return true;
			}
		}
		return false;
	}
}