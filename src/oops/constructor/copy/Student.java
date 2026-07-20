package oops.constructor.copy;

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
	
	Student(Student s){
		System.out.println("===== START : PARA(COPY) Constructor");
		
		System.out.println("BEFORE : " + this.rno + " " + this.name + " " + this.std + " " + this.marks);
		
		this.rno = s.rno;
		this.name = s.name;
		this.std = s.std;
		this.marks = s.marks;
		
		System.out.println("===== END : PARA(COPY) Constructor");
		
		System.out.println("AFTER : " + this.rno + " " + this.name + " " + this.std + " " + this.marks);
	}
	
	public void dispData() {
		System.out.println(rno + " " + name + " " + std + " " + marks);
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Henil", 12, 100);
		Student s2 = new Student(s1);
		
		s1.dispData();
		s2.dispData();
	}
}
