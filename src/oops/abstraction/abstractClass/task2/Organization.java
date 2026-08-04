package oops.abstraction.abstractClass.task2;

public class Organization extends Person{
	
	@Override
	public void getBehave() {
		
		System.out.println("Organization - getBehave() - Employee Behaviour");
		
	}
	
	public void getSalary() {
		
		System.out.println("Organization - getSalary() - Employee Salary");
	}
}
