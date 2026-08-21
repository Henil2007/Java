package string.methods;

import java.util.Scanner;

public class EmailVarification {
	
	public static void main(String[] args) {
		
		String email;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter email : ");
		email = sc.nextLine();
		
		if (email.contains("@") && email.endsWith(".com") && email.contains("gmail") && email.indexOf("@") > 0) {
			System.out.println("Valid email");
		}
		else {
			System.out.println("Invalid email");
		}
		
		sc.close();
	}
}
