package oops.inheritance.simple;

import java.util.Scanner;

public class Student extends Person {
	
	int rno,std,marks;
	
	public void scanData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entr rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name : ");
		name = sc.nextLine();
		System.out.println("Enter std : ");
		std = sc.nextInt();
		System.out.println("Enter marks : ");
		marks = sc.nextInt();
		
		sc.close();
	}
	public void dispData() {
		System.out.println(rno + " " + name + " " + std + " " + marks);
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.scanData();
		s1.dispData();
	}
}
