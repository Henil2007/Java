package oops.polymorphism.runtime.hospitalManagementSystem;

public class Nurse extends HospitalPerson{
	
	@Override
	public void performDuty() {
		System.out.println("Nurse is commig...");
	}
	
	public void assistPatient() {
		System.out.println("nurse is assisting the Patient.");
	}
}
