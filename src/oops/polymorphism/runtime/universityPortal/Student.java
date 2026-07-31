package oops.polymorphism.runtime.universityPortal;

public class Student extends UniversityMember{
	
	@Override
	public void Work() {
		System.out.println("Welcome to Student portal.");
	}
	
	public void viewResult() {
		System.out.println("Congratulation you are FAIL in the EXAM");
	}
}
