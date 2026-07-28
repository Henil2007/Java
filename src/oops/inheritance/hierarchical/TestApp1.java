package oops.inheritance.hierarchical;

public class TestApp1 {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.scanData();
		
		Employee e1 = new Employee();
		e1.scanData();
		
		s1.dispData();
		e1.dispData();
	}
}
