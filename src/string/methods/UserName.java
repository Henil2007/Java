package string.methods;

import java.util.Scanner;

public class UserName {
	
	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		
		System.out.println("Name Initial letter = " + name.charAt(0));
		
		sc.close();
	}
}
