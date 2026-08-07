package oops.abstraction.interfaceclass.task3;

public class Receptionist implements HospitalPerson{
	
	@Override
	public void performDuty() {
		System.out.println("Recertionist : Welcome to the hospital.");
	}
	
	public void bookAppointment() {
		System.out.println("Booking appointment with doctor.");
	}
}
