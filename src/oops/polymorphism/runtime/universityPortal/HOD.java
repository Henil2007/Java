package oops.polymorphism.runtime.universityPortal;

public class HOD extends UniversityMember{
	
	@Override
	public void Work() {
		System.out.println("Welocme to HOD portal.");
	}
	
	public void approveLeave() {
		System.out.println("HOD approves the university leave.");
	}
}
