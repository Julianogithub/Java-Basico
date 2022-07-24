package ConjuntosOfObj;

import laptop.person.Person;
import laptop.person.Person2;

public class DemoPerson {
	public String runPerson() {
		System.out.println("***** Encapsulation 2 *****\n");
		
		Person john = new Person();
		System.out.println(john);

		Person pooja = new Person("Pooja", 26, "Female");
		System.out.println(pooja);

		pooja.setAge(-30);
		System.out.println(pooja);

		pooja.setAge(30);
		System.out.println(pooja);

		return "***** Encapsulation 1 *****";
	}

	public String runPerson2() {
		System.out.println("***** Encapsulation 2 *****\n");
		
		Person2 pooja2 = new Person2("Pooja", 28, "Female");
		System.out.println(pooja2);
		
		pooja2.setAge(-30);
		System.out.println(pooja2);
		
		pooja2.setAge(40);
		System.out.println(pooja2);

		return "***** Encapsulation 2 *****";
	}
}
