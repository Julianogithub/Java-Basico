 package interfacesStart;

import abstractPerson.NonVegan;
import abstractPerson.Person;
import abstractPerson.Vegan;
import interfacesCode.Ipone8;
import interfacesCode.OnePlus5;
import interfacesCode.Phone;
import abstractPerson2.Person2;
import abstractPerson2.Vegan2;
import innerClass.Door;

public class DemoInterface {
	
	public String runPhone() {
		System.out.println("------ Interface -------");
		
		Phone phone = new OnePlus5();
		System.out.println("Processor: "+phone.processor());
		System.out.println("Space in GB: "+phone.spaceInGB());
		System.out.println("Space in GB: "+phone.OS());
		Phone phone2 = new Ipone8();
		System.out.println("Processor: "+phone2.processor());
		System.out.println("Space in GB: "+phone2.spaceInGB());
		System.out.println("Space in GB: "+phone2.OS());
		
		return"------ Interface -------";
	}
	
	public String runNome() {
		System.out.println("------ Abstract class -------");
		
		Person john = new Vegan();
		john.speak();
		john.eat();
		System.out.println("************");
		Person mia = new NonVegan();
		mia.speak();
		mia.eat();
		
		return"------ Abstract class -------";
	}
	
	public String runNomeAbstract() {
		System.out.println("------ Abstract class -------");
		
		Person2 john = new Vegan2();
		john.breathe();
		john.eat();
		john.speak();
		john.message();
		
		return"------ Abstract class -------";
	}
	
	public String runShop() {
		System.out.println("------ Inner class -------");
		
		Door door = new Door();
		door.shopStatus();
		door.getLock().setLock(false);
		door.shopStatus();
				
		return"------ Inner class -------";
	}
	
	public String runShopInner() {
	
				
		return"------ Inner class -------";
	}
	
}
