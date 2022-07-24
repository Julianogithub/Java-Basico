package Operadores;

public class OpeDeAssignment {
	public String run() {

		int x = 5, a = 3, t = 3, b = 9, y = -7, c = -3, d = 8, h = 6, p = 49, z = 10;
		
		a += 3; 
		System.out.println(a + " :a ");
		
		t = t + 2;
		System.out.println(t + " :t ");
		
		b -= 5;
		System.out.println(b + " :b ");
		
		y = y - 5;
		System.out.println(y + " :y ");
		
		c *= 5; 
		System.out.println(c + " :c ");
		
		h = h * 5;
		System.out.println(h + " :h ");
		
		d /= 4;
		System.out.println(d + " :d ");
		
		p = p / 7;
		System.out.println(p + " :p ");
		
		x %= 45;
		System.out.println(x + " :x ");
		
		z = z % 100;
		System.out.println(z + " :z ");
		
		return "-------------- Operador de decizao2 -----------------------";
	}

}
