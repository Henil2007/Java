package oops.encapsulation.task1;

public class TestApp1 {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setRno(1);
		s1.setName("Henil");
		s1.setStd(12);
		s1.setMarks(100);
		
		System.out.println(s1.getRno());
		System.out.println(s1.getName());
		System.out.println(s1.getStd());
		System.out.println(s1.getMarks());
	}
}
