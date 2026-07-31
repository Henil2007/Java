package oops.polymorphism.runtime.universityPortal;

public class Faculty extends UniversityMember{
	
	@Override
	public void Work() {
		System.out.println("Welcome to Faculty Portal.");
	}
	
	public void takeLecture() {
		System.out.println("faculty is taking the lecture.");
	}
}
