package oops.polymorphism.runtime.bankCustomer;

public class CurrentCustomer extends Customer{
	
	@Override
	public void getService() {
		System.out.println("Welcome to bank Current Customer Desk.");
	}
	
	public void getChequeBook() {
		System.out.println("Issuing a Cheque Book.");
	}
}
