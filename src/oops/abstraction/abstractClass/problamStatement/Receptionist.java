package oops.abstraction.abstractClass.problamStatement;

public class Receptionist extends HospitalPerson{
	
	@Override
	public void performDuty() {
		System.out.println("Recertionist : Welcome to the hospital.");
	}
	
	public void bookAppointment() {
		System.out.println("Booking appointment with doctor.");
	}
}
