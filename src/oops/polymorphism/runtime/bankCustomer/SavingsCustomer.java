package oops.polymorphism.runtime.bankCustomer;

public class SavingsCustomer extends Customer{
	
	@Override
	public void getService() {
		System.out.println("Welcome to Bank Saving Customer Desk.");
	}
	
	public void getPassbook() {
		System.out.println("Issuing Saving a/c passbook.");
	}
}
