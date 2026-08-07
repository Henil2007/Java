package oops.abstraction.interfaceclass.task3;

public class Nurse implements HospitalPerson{
	
	@Override
	public void performDuty() {
		System.out.println("Nurse : Nurse will assist the patient.");
	}
	
	public void assistPatient() {
		System.out.println("Glucose will be given by the nurse.");
	}
}
