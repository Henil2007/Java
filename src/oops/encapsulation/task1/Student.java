package oops.encapsulation.task1;

public class Student {
	
	private int rno;
	private String name;
	private int marks;
	private int std;
	
	// Setter function
	public void setRno(int rno) {
		this.rno = rno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	// Getter function
	public int getRno() {
		return rno;
	}
	public String getName() {
		return name;
	}
	public int getStd() {
		return std;
	}
	public int getMarks() {
		return marks;
	}
}
