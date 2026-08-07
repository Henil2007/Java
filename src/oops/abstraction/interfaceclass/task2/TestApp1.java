package oops.abstraction.interfaceclass.task2;

import java.util.Scanner;

public class TestApp1{
	
	public static void getBehaveBasedPlace(Person person) {
		
		person.getBehave();
		
		if (person instanceof School) {
			School student = (School) person;
			student.getResult();
		}
		else if (person instanceof Organization) {
			Organization employee = (Organization) person;
			employee.getSalary();
		}
		else if (person instanceof PublicPlace) {
			PublicPlace p = (PublicPlace) person;
			p.getPublicEventInfo();
		}
		else if (person instanceof Home) {
			Home home = (Home) person;
			home.getMovieTime();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. School");
		System.out.println("2. Organization");
		System.out.println("3. Public Place");
		System.out.println("4. Home");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		
		switch(choice) 
		{
			case 1: School school = new School();
					getBehaveBasedPlace(school);
					break;
			case 2: Organization org = new Organization();
					getBehaveBasedPlace(org);
					break;
			case 3: PublicPlace pp = new PublicPlace();
					getBehaveBasedPlace(pp);
					break;
			case 4: Home home= new Home();
					getBehaveBasedPlace(home);
					break;
		}
		sc.close();
	}
}
