package string.methods;

import java.util.Scanner;

public class PasswordChecker {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String password;
		
		System.out.println("Enter password : ");
		password = sc.nextLine();
		
		if (password.length() >= 8 && password.contains("@")) {
			System.out.println("Strong Password");
		}
		else {
			System.out.println("Week password");
		}
		
		sc.close();
	}
}
