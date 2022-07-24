package ComesoJava;

public class PrimitiveDataTypes {
	public String run(){
		byte byteMax = 127;
		byte byteMin = -128;
		int max = 2147483647;
		int min = -2147483648;
		short shortMax = 32767;
		short shortMin = -32768;
		long longMax = 9223372036854775807L;
		long longMin = -9223372036854775808L;
		
		System.out.println("valor do byte max : " + byteMax);
		System.out.println("valor do byte min : " + byteMin);
		System.out.println("valor do int max : " + max);
		System.out.println("valor do int min : " + min);
		System.out.println("valor do short max : " + shortMax);
		System.out.println("valor do short min : " + shortMin);
		System.out.println("valor do long max : " + longMax);
		System.out.println("valor do long min : " + longMin);
		
		return "-------------------------------------";
	}
}
