package MethodsJava;

public class MethodsOverloading {
	public String run() {
		System.out.println("Area of rectangle: "+area(14.25d, 10.65d));
		System.out.println("Area of square: "+area(5.0d));
		
		return"------- Methods Overloading ---------";
	}
	public static double area(double length, double width){
		return length*width;
	}
	public static double area(double side){
		return side*side;
	}
	public static int area(int side){
		return side*side;
	}
}
