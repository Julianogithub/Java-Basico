package abstractPerson2;

public abstract class Person2 implements IsAlive,LiveLife{
	
	public void speak(){
		System.out.println("Shares his/her thoughts.");
	}
	
	@Override
	public void breathe(){
		System.out.println("be alive; remain living.");
	}
	
	@Override
	public void message(){
		System.out.println("life is journey, keep moving and meet new people.");
	}
	public abstract void eat();
}
