package string.methods;

import java.util.Scanner;

public class LoginAuthentication {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "admin";
		String password = "Admin123";
		
		String userName;
		String userPassword;
		
		System.out.println("====== Welcome to Login Portal ======");
		System.out.println("Enter name : ");
		userName = sc.nextLine();
		System.out.println("Enter Password : ");
		userPassword = sc.nextLine();
		
		if(userPassword.equals(password) && userName.equalsIgnoreCase(name)) {
			System.out.println("Login Successfull...");
		}
		else {
			System.out.println("Invalid password !");
		}
		
		sc.close();
	}
}
