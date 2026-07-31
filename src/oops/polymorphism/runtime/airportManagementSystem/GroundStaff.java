package oops.polymorphism.runtime.airportManagementSystem;

public class GroundStaff extends AirportUser{
	
	@Override
	public void accessAirport() {
		System.out.println("Ground Staff can access airport.");
	}
	
	public void manageBaggage() {
		System.out.println("Check that Bagges are properly arranged or not.");
	}
}
