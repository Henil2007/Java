package oops.inheritance.simple.constructor;

//import java.util.Scanner;

public class Student extends Person {
	
	int rno,std,marks;
	
	public Student() {
		System.out.println("STUDENT : DEFAULT Constructor");
		rno = 0;
		name = null;
		std = 0;
		marks = 0;
	}
	
	public Student(int rno,String name, int std, int marks) {
		
		super(name);
		System.out.println("STUDENT : PARA Constructor");
		this.rno = rno;
		this.std = std;
		this.marks = marks;
	}

	public void dispData() {
		System.out.println(rno + " " + name + " " + std + " " + marks);
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(101,"Henil",12,100);
		
		s1.dispData();
	}
}
