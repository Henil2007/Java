package oops.polymorphism.runtime.hospitalManagementSystem;

public class Doctor extends HospitalPerson{
	
	@Override
	public void performDuty() {
		System.out.println("Doctor is comming...");
	}
	
	public void pescribeMedicine() {
		System.out.println("Doctor give priscribtion of medicine.");
	}
}
