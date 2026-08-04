package oops.abstraction.abstractClass.task2;

public class PublicPlace extends Person{
	
	@Override
	public void getBehave() {
		
		System.out.println("Public Place- getBehave() - Citizen Behaviour");
		
	}
	
	public void getPublicEventInfo() {
		System.out.println("Person - getPublicEventInfo() - Human Public info");
	}
}
