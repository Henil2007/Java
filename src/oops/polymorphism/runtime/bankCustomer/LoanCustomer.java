package oops.polymorphism.runtime.bankCustomer;

public class LoanCustomer extends Customer{
	
	@Override
	public void getService() {
		
		System.out.println("Welcome to bank Loan Desk.");
	}
	
	public void getLoanDetails() {
		System.out.println("These are some Loan Details.");
	}
}
