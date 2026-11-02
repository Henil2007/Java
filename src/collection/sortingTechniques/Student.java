package collection.sortingTechniques;

public class Student implements Comparable<Student>{
	private int rno;
	private String name;
	private int std;
	private int marks;

	public Student(int rno, String name, int std, int marks) {
		super();
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	// Marks wise sorting
	@Override
	public int compareTo(Student s2) {
		if (getMarks() > s2.getMarks()) {
			return 1;
		} else if (getMarks() < s2.getMarks()) {
			return -1;
		}
		else {
			return 0;
		}
	}

//	@Override
//	public String toString() {
//		return rno + " " + name + " " + std + " " + marks;
//	}

}
