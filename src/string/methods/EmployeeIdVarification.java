package string.methods;

import java.util.Scanner;

public class EmployeeIdVarification {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String empId;
		
		System.out.println("Enter employee id : ");
		empId = sc.nextLine();
		
		if (empId.startsWith("EMP") && empId.length() <= 8 ) {
			System.out.println("Valid Employee Id");
		}
		else {
			System.out.println("Not a valid employee Id");
		}
		
		sc.close();
	}
}
