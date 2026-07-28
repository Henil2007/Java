package oops.inheritance.hierarchical;

import java.util.Scanner;

public class Student extends Person{
	
	int rno,marks,std;
	Scanner sc = new Scanner(System.in);
	
	public void scanData() {
		
		
		System.out.println("Enter Roll No. : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name : ");
		name = sc.nextLine();
		System.out.println("Enter Standard : ");
		std = sc.nextInt();
		System.out.println("Enter marks : ");
		marks = sc.nextInt();
		
	}
	
	public void dispData() {
		
		System.out.println(rno + " " + name + " " + std + " " + marks);
	}
}
