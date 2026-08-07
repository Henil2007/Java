package oops.abstraction.interfaceclass.task3;

public class Patient implements HospitalPerson{
	
	@Override
	public void performDuty() {
		System.out.println("person : I have some fever.");
	}
	
	public void getTretement() {
		System.out.println("I want Teretement of my decise");
	}
}
