package oops.abstraction.interfaceclass.task2;

public class Home implements Person{
	
	@Override
	public void getBehave() {
		
		System.out.println("Home - getBehave() - Child Behaviour");
		
	}
	
	public void getMovieTime() {
		System.out.println("Home - getMovieTime() - Child Movie Time");
	}
}
