package exception;

import java.util.Scanner;

public class TestApp12 {
	
	public static void isValidForVoat(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Invalid Age\nEnter a valid age");
		}
		else {
			System.out.println("Welocme for vote");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age;
		System.out.println("Enter age : ");
		age = sc.nextInt();
		
		try {
			isValidForVoat(age);
			
		} 
		catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}
