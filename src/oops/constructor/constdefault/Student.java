package oops.constructor.constdefault;

public class Student {
	
	private int rno;
	private String name;
	private int std;
	private int marks;
	
	// Student class default constructor
	Student() {
		System.out.println("=====Start : Default Constructor");
		
		System.out.println("BEFORE : "+rno + " " + name + " " + std + " " + marks);
		
		rno = 1;
		name = "Henil";
		std = 12;
		marks = 100;
		
		System.out.println("AFTER : "+rno + " " + name + " " + std + " " + marks);
		System.out.println("=====Exit  : Default Constructor");
	}
}
