package oops.polymorphism.runtime.task3;

public class School extends Person{
	
	@Override
	public void getBehave() {
		
		System.out.println("School - getBehave() - Student Behaviour");
		
	}
	
	public void getResult() {
		
		System.out.println("Home - getResult() - Child Result");
	}
}
