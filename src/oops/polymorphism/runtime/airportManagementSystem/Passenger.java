package oops.polymorphism.runtime.airportManagementSystem;

public class Passenger extends AirportUser{
	
	@Override
	public void accessAirport() {
		System.out.println("Passenger can access the airport.");
	}
	
	public void checkIn() {
		System.out.println("Passenger can checkIn with the help of Ticket.");
	}
}
