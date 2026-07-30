package oops.polymorphism.runtime.bankCustomer;

public class PremiumCustomer extends Customer{
	
	@Override
	public void getService() {
		
		System.out.println("Welcome to bank Premium Customer Desk.");
	}
	
	public void getLoungeAccess() {
		System.out.println("Premium customer varified, you can access the lounge");
	}
}
