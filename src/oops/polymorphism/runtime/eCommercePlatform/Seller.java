package oops.polymorphism.runtime.eCommercePlatform;

public class Seller extends User{

	@Override
	public void usePortal() {
		System.out.println("Welcome to Seller Portal.");
	}
	
	public void addProduct() {
		System.out.println("Thank you For adding New Product.");
	}
}
