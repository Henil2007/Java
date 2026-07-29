package oops.polymorphism.runtime.task3;

public class Home extends Person{
	
	@Override
	public void getBehave() {
		
		System.out.println("Home - getBehave() - Child Behaviour");
		
	}
	
	public void getMovieTime() {
		System.out.println("Home - getMovieTime() - Child Movie Time");
	}
}
