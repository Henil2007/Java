package oops.abstraction.interfaceclass.task2;

public class School implements Person{
	
	@Override
	public void getBehave() {
		
		System.out.println("School - getBehave() - Student Behaviour");
		
	}
	
	public void getResult() {
		
		System.out.println("Home - getResult() - Child Result");
	}
}
