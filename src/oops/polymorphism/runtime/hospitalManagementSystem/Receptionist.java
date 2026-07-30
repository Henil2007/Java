package oops.polymorphism.runtime.hospitalManagementSystem;

public class Receptionist extends HospitalPerson{
	
	@Override
	public void performDuty() {
		System.out.println("Welcome to the Hospital.");
	}
	
	public void bookAppointment() {
		System.out.println("Booking an appointment with the doctor.");
	}
}
