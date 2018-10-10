package lesson3;

public class Java03 {

	public static void main(String[] args) {
		printPrice("ピザ", 3000);
		printPrice("コーラ", 150);
	}

	public static void printPrice(String item, int price) {
		System.out.println(item + "は" + price + "円です");
	}
}