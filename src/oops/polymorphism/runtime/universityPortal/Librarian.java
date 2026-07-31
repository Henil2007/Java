package oops.polymorphism.runtime.universityPortal;

public class Librarian extends UniversityMember{
	
	@Override
	public void Work() {
		System.out.println("Welcome to library portal.");
	}
	
	public void issueBook() {
		System.out.println("Library is issuing the book.");
	}
}
