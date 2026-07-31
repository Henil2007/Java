package oops.polymorphism.runtime.eCommercePlatform;

public class Admin extends User{
	
	@Override
	public void usePortal() {
		System.out.println("Welcome to the Admin portal");
	}
	
	public void manageSystem() {
		System.out.println("Welcome to E-Commerce Management system");
	}
}
