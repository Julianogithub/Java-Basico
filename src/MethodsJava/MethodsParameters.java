package MethodsJava;

public class MethodsParameters {
	public String run() {
		System.out.println("Area of rectangle with length = 5.4 and width 3.2 : ");
		System.out.println(areaRectangle(5.4, 3.2));
		// double area = areaRectangle(5.4, 3.2);
		// System.out.println(area);
		return "----------- Methods Parameters ----------";
	}

	public static double areaRectangle(double length, double width) {
		return length * width;
	}
}
