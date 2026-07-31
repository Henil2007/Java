package oops.polymorphism.runtime.airportManagementSystem;

import java.util.Scanner;

public class Testapp1 {
	
	public static void getAirportManagementSystem(AirportUser airport) {
		airport.accessAirport();
		
		if(airport instanceof Passenger) {
			Passenger passenger = (Passenger) airport;
			passenger.checkIn();
		}
		else if (airport instanceof Pilot) {
			Pilot pilot = (Pilot) airport;
			pilot.flyAircraft();
		}
		else if (airport instanceof SecurityOfficer) {
			SecurityOfficer security = (SecurityOfficer) airport;
			security.checkSecurity();
		}
		else if (airport instanceof GroundStaff) {
			GroundStaff ground = (GroundStaff) airport;
			ground.manageBaggage();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while (true) {
			System.out.println();
			System.out.println("1. Passenger");
			System.out.println("2. Pilot");
			System.out.println("3. Security Officer");
			System.out.println("4. Ground Staff");
			System.out.println("5. Exit");
			System.out.println("Enter Your choice : ");
			choice = sc.nextInt();
			
			switch (choice)
			{
			case 1: Passenger passenger = new Passenger();
					getAirportManagementSystem(passenger);
					break;
			case 2: Pilot pilot = new Pilot();
					getAirportManagementSystem(pilot);
					break;
			case 3: SecurityOfficer security = new SecurityOfficer();
					getAirportManagementSystem(security);
					break;
			case 4: GroundStaff ground = new GroundStaff();
					getAirportManagementSystem(ground);
					break;
			case 5: System.exit(0);
			}
		}
	}
}
