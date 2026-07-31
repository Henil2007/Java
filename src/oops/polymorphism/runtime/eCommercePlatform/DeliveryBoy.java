package oops.polymorphism.runtime.eCommercePlatform;

public class DeliveryBoy extends User{
	
	@Override
	public void usePortal() {
		System.out.println("Welcome to delivery Portal.");
	}
	
	public void deliverProduct() {
		System.out.println("Thank you for deliverying the product.");
	}
}
