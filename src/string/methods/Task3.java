package string.methods;

import java.util.Scanner;

public class Task3 {
	
	public static void calculator() {
		Scanner sc = new Scanner(System.in);
		int no1,no2,choice , ans;
		
		System.out.println("Enter no1 : ");
		no1 = sc.nextInt();
		System.out.println("Enter no2 : ");
		no2 = sc.nextInt();
		
		while (true) {
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			
			switch (choice) {
				case 1: ans = no1 + no2;
						System.out.println("Addition = " + ans);
						break;
				case 2: ans = no1 - no2;
						System.out.println("Substraction = " + ans);
						break;
				case 3: ans = no1 * no2;
						System.out.println("Multiplication = " + ans);
						break;
				case 4: if(no2 == 0) {
							System.out.println("Enter non zero number.");
						}
						else {
							ans = no1 / no2;
							System.out.println("Division = " + ans);
						}
						break;
				case 5: System.exit(0);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email = "henil@gmail.com";
		String password = "henil123";
		
		int count = 3;
		
		while(count > 0) {
			System.out.println("Enter Email : ");
			String e = sc.nextLine();
			System.out.println("Enter Password : ");
			String p = sc.nextLine();
			count--;
			
			if(e.compareToIgnoreCase(email) == 0 && p.compareTo(password) == 0) {
				System.out.println("Login Successfull...");
				calculator();
				break;
			}
			else {
				System.out.println("Invalid email or password");
				System.out.println("Attempt remaning = " + count);
			}
		}
		sc.close();
	}
}
