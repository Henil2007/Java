package oops.abstraction.abstractClass.problamStatement;

public class Patient extends HospitalPerson{
	
	@Override
	public void performDuty() {
		System.out.println("person : I have some fever.");
	}
	
	public void getTretement() {
		System.out.println("I want Teretement of my decise");
	}
}
