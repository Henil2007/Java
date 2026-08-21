package string.methods;

import java.util.Scanner;

public class DomainChecker {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String domain;
		
		System.out.println("Enter domain : ");
		domain = sc.nextLine();
		
		if (domain.endsWith(".com")) {
			System.out.println("Commercial Website");
		}
		else if (domain.endsWith(".org")) {
			System.out.println("Organizational Website");
		}
		else if (domain.endsWith(".in")) {
			System.out.println("Indian Website");
		}
		else if (domain.endsWith(".edu")) {
			System.out.println("Educational Website");
		}
		else {
			System.out.println("please enter a valid domain");
		}
		
		sc.close();
	}
}
