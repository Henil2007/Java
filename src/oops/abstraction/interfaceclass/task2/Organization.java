package oops.abstraction.interfaceclass.task2;

public class Organization implements Person{
	
	@Override
	public void getBehave() {
		
		System.out.println("Organization - getBehave() - Employee Behaviour");
		
	}
	
	public void getSalary() {
		
		System.out.println("Organization - getSalary() - Employee Salary");
	}
}
