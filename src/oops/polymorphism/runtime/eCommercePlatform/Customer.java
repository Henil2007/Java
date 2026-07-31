package oops.polymorphism.runtime.eCommercePlatform;

public class Customer extends User{

	@Override
	public void usePortal() {
		System.out.println("Welcome to Customer care");
	}
	
	public void placeOrder() {
		System.out.println("Thank you for Placting the order.");
	}
}
