package oops.constructor.thisconstructor;

public class Student {
	
	
	private int rno;
	private String name;
	private int std;
	private int marks;
	
	Student(){
		
		System.out.println("===== START : DEFAULT Constructor =====");
		
		rno = 0;
		name = null;
		std = 0;
		marks = 0;
	}
	
	Student(int rno, String name){
		
		this();
		System.out.println("===== START : PARA TWO Constructor");
		
		this.rno = rno;
		this.name = name;
	}
	
	Student(int rno, String name , int std){
		
		this(rno,name);
		System.out.println("===== START : PARA THREE Constructor");
		
//		this.rno = rno;
//		this.name = name;
		this.std = std;
	}
	
	Student(int rno, String name , int std , int marks){
		
		this(rno,name,std);
		System.out.println("===== START : PARA FOUR Constructor");

//		this.rno = rno;
//		this.name = name;
//		this.std = std;
		this.marks = marks;
	}
	
	
	
	Student(Student s){
		
		this(s.rno,s.name,s.std,s.marks);
		System.out.println("===== START : PARA(COPY) Constructor");
		
		
	}
	
	public void dispData() {
		System.out.println(rno + " " + name + " " + std + " " + marks);
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Henil");
		
		s1.dispData();
	}
}
