package MethodsJava;

public class MethodsOverloading2 {
	public String run() {
		System.out.println("1+2="+sum(1,2));
		System.out.println("1+2.5="+sum(1,2.5F));
		System.out.println("1.3+2.3="+sum(1.3,2.3));
		System.out.println("1+2+3="+sum(1,2,3));
		
		return"------- Methods Overloading2 ---------";
	}
	
	public static int sum(int x, int y){
		System.out.println("\nAdding 2 int entities");
		return x+y;
	}
	public static float sum(int x, float y){
		System.out.println("\nAdding 1 int and 1 float entity");
		return x+y;
	}
     
	public static double sum(double x, double y){
		System.out.println("\nAdding 2 double entities");
		return x+y;
	}
	public static int sum(int x, int y,int z){
		System.out.println("\nAdding 3 int entities");
		return x+y+z;
	}
}
