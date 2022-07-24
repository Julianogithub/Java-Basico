package ComesoJava;

public class String_Float {
	public String run() {
		String var = new String("Hello world");
		System.out.println(var);

		int in = 10;
		float fl = (float) in;
		System.out.println(fl);
		
		int y1 = 65000;
		short x1 = (byte) y1;
		System.out.println(x1);
		
		int y2 = 65000;
		short x2 = (short) y2;
		System.out.println(x2);
		
		double y3 = 20.0123456789d;
		float x3 = (float) y3;
		System.out.println(x3);
		
		double y4 = 20.0123456789d;
		float x4 = (short) y4;
		System.out.println(x4);
		
		float f = 10.532f;
		long lo = (long) f;
		System.out.println(lo);
		
		int a = 25;
		float b = 45.532f;
		double value = a*a + 2*(a*b) + b*b;
		System.out.println("Value of the equation is: " + value);
		
		int a1 = 25;
		float b1 = 45.532f;
		int value1 = (int)(a1*a1 + 2*(a1*b1) + b1*b1);
		System.out.println("Value of the equation is: " + value1);

		return "-------------------------------------";
	}
}
