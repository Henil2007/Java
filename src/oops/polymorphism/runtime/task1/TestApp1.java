package oops.polymorphism.runtime.task1;

import java.util.Scanner;

public class TestApp1{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. School");
		System.out.println("2. Organization");
		System.out.println("3. Public Place");
		System.out.println("4. Home");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		
		Person person = null;
		
		switch(choice) 
		{
			case 1: person = new School();
					person.getBehave();
					break;
			case 2: person = new Organization();
					person.getBehave();
					break;
			case 3: person = new PublicPlace();
					person.getBehave();
					break;
			case 4: person = new Home();
					person.getBehave();
					break;
		}
		sc.close();
	}
}
