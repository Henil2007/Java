package exception;

import java.io.IOException;
import java.util.Scanner;

public class TestApp10 {
	
	public static void isValidForVoat(int age) throws IOException  {
		if (age < 18) {
			throw new IOException("Invalid Age\nEnter a valid age");
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
		catch (IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}
