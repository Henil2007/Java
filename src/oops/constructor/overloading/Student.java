package oops.constructor.overloading;

public class Student {
	
	private int rno;
	private String name;
	private int std;
	private int marks;
	
	Student(){
		System.out.println("===== START : DEFAULT Constructor");
		
		rno = 0;
		name = null;
		std = 0;
		marks = 0;
		
		System.out.println("===== END : DEFAULT Constructor");
	}
	
	Student(int rno, String name , int std , int marks){
		System.out.println("===== START : PARA Constructor");
		
		System.out.println("BEFORE : " + this.rno + " " + this.name + " " + this.std + " " + this.marks);
		
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
		
		System.out.println("AFTER : " + this.rno + " " + this.name + " " + this.std + " " + this.marks);
		
		System.out.println("===== END : PARA Constructor");
	}
	
	Student(Student s){
		System.out.println("===== START : PARA(COPY) Constructor");
		
		System.out.println("BEFORE : " + this.rno + " " + this.name + " " + this.std + " " + this.marks);
		
		this.rno = s.rno;
		this.name = s.name;
		this.std = s.std;
		this.marks = s.marks;
		
		System.out.println("AFTER : " + this.rno + " " + this.name + " " + this.std + " " + this.marks);
		
		System.out.println("===== END : PARA(COPY) Constructor");
	}
	
	public void dispData() {
		System.out.println(rno + " " + name + " " + std + " " + marks);
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student(1,"Henil",12,100);
		Student s3 = new Student(s2);
		
		s1.dispData();
		s2.dispData();
		s3.dispData();
	}
}
