package ComesoJava;

import java.math.BigDecimal;

public class BigDecimalDemo {
	public String run() {
		System.out.println("\tSiti: https://docs.oracle.com/javase/8/docs/api/java/math/class-use/BigDecimal.html");
		double x = 1.05;
		double y = 2.55;
		double w = 1.55;
		double a = 2.05;
		double b = 2.55;
		
		System.out.println("\n------- Normal declaradas--------");
		System.out.println(x);
		System.out.println(y);
		System.out.println(w);
		System.out.println(a);
		System.out.println(b);
		
		
		System.out.println("\n------- Normal Print--------");
		System.out.println(2.00 - 1.1);
		System.out.println(2.00 - 1.2);
		System.out.println(2.00 - 1.3);
		System.out.println(2.00 - 1.4);
		System.out.println(2.00 - 1.5);
		System.out.println(2.00 - 1.6);
		System.out.println(2.00 - 1.7);
		
		System.out.println("\n------- BigDecimal Usage Print Number ---------");
		BigDecimal bigdec1 = new BigDecimal(1.05);
		BigDecimal bigdec2 = new BigDecimal(1.22);
		BigDecimal bigdec3 = new BigDecimal(1.55);
		BigDecimal bigdec4 = new BigDecimal(2.05);
		BigDecimal bigdec5 = new BigDecimal(2.55);
		System.out.println(bigdec1.add(bigdec2));
		System.out.println(bigdec1.add(bigdec5));
		System.out.println(bigdec2.add(bigdec3));
		System.out.println(bigdec3.add(bigdec4));
		System.out.println(bigdec4.add(bigdec5));
		
		System.out.println("\n------- BigDecimal Usage Print with String ---------");
		BigDecimal bigdec6 = new BigDecimal("1.05");
		BigDecimal bigdec7 = new BigDecimal("1.22");
		BigDecimal bigdec8 = new BigDecimal("1.55");
		BigDecimal bigdec9 = new BigDecimal("2.05");
		BigDecimal bigdec0 = new BigDecimal("2.55");
		System.out.println(bigdec6.add(bigdec7));
		System.out.println(bigdec7.add(bigdec8));
		System.out.println(bigdec8.add(bigdec9));
		System.out.println(bigdec9.add(bigdec0));
		System.out.println(bigdec0.add(bigdec6));
		
		return "-------------------------------------";
	}
}
