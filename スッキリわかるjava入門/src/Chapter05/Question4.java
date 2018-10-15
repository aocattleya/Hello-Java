package Chapter05;

public class Question4 {

	public static void main(String[] args) {

		double calcTriangleArea = calcTriangleArea(10, 5);
		System.out.println("三角形の面積：" + calcTriangleArea + "平方cm");

		double CiecleArea = calcCircleArea(5);
		System.out.println("円の面積：" + CiecleArea + "平方cm");
	}

	public static double calcTriangleArea(double bottom, double height) {
		double area = bottom * height / 2;
		return area;
	}

	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
}