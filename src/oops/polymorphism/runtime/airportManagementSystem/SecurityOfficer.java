package oops.polymorphism.runtime.airportManagementSystem;

public class SecurityOfficer extends AirportUser{
	
	@Override
	public void accessAirport() {
		System.out.println("Security Staff can access airport.");
	}
	
	public void checkSecurity() {
		System.out.println("Check each and every person with metal decetictor machine");
	}
}
