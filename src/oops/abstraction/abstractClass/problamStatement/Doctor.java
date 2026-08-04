package oops.abstraction.abstractClass.problamStatement;

public class Doctor extends HospitalPerson {
	
	@Override
	public void performDuty() {
		System.out.println("Doctor : Writing the medicine");
	}
	
	public void prescribeMedicine() {
		System.out.println("Take medicine 2 times in a day");
	}
}
