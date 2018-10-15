// Java02Calc.Java
package Chapter06;

public class Java02Calc {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int total = Java02CalcLogic.tasu(a, b);
		int delta = Java02CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}