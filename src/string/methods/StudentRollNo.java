package string.methods;

import java.util.Scanner;

public class StudentRollNo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String rolllno;
		
		System.out.println("Enter roll no : ");
		rolllno = sc.nextLine();
		
		System.out.println(rolllno.substring(3));
		
		sc.close();
	}
}
