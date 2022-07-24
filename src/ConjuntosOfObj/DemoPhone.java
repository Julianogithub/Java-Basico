package ConjuntosOfObj;

import laptop.phone.MotoG;
import laptop.phone.Nokia;
import laptop.phone.Nokia2;
import laptop.phone.Phone;
import laptop.phone.Phone2;
import laptop.phone.Samsung;
import laptop.phone.Samsung2;

public class DemoPhone {
	public String runPhone() {
		System.out.println("\n\t** Polymorphism **");
		
		Phone note8 = new Samsung("Note 8");
		System.out.println(note8.getModel());
		note8.features();
				
		Phone nokia3310 = new Nokia("Nokia 3310");
		System.out.println(nokia3310.getModel());
		nokia3310.features();
		return "----- Polymorphism Parte 1 ------";
	}
	
	public String runPhone2() {
		System.out.println("\n\t** Polymorphism 2 **");
		
		Phone nokia3310 = new DemoPhone().phone(1);
		System.out.println(nokia3310.getModel());
		nokia3310.features();
				
		Phone note8 =  new DemoPhone().phone(2);
		System.out.println(note8.getModel());
		note8.features();
		
		Phone motoG =  new DemoPhone().phone(3);
		System.out.println(motoG.getModel());
		motoG.features();
		return "----- Polymorphism Parte 2 ------";
	}
	
	public Phone phone(int dailyDriver){
		switch(dailyDriver){
		case 1: return new Nokia2("3310");
		case 2: return new Samsung2("Note 5");
		case 3: return new MotoG("Motorola G7");
		
		}
		return null;
	}
}
