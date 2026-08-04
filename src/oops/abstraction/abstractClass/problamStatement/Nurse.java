package oops.abstraction.abstractClass.problamStatement;

public class Nurse extends HospitalPerson{
	
	@Override
	public void performDuty() {
		System.out.println("Nurse : Nurse will assist the patient.");
	}
	
	public void assistPatient() {
		System.out.println("Glucose will be given by the nurse.");
	}
}
