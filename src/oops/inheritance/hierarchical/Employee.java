package oops.inheritance.hierarchical;

import java.util.Scanner;

public class Employee extends Person{
	
	int eid,salary;
	String dsgn , orgName;
	
	public void scanData() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID : ");
		eid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter dsgn : ");
		dsgn = sc.nextLine();
//		sc.nextLine();
		System.out.println("Enter orgName : ");
		orgName = sc.nextLine();
		
		sc.close();
	}
	
	public void dispData() {
		
		System.out.println(eid + " " + name + " " + salary + " " + dsgn + " " + orgName);
	}
}
