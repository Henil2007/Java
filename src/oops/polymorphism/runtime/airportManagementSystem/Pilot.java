package oops.polymorphism.runtime.airportManagementSystem;

public class Pilot extends AirportUser{
	
	@Override
	public void accessAirport() {
		System.out.println("Pilot can access the airport");
	}
	
	public void flyAircraft() {
		System.out.println("Pilot can fly the Aircraft.");
	}
}
