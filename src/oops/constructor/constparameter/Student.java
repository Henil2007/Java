package oops.constructor.constparameter;

public class Student {
	
	private int rno;
	private String name;
	private int std;
	private int marks;
	
	Student(int rno, String name , int std , int marks){
		
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}
	
	public void dispData() {
		System.out.println(rno + " " + name + " " + std + " " + marks);
	}
}
