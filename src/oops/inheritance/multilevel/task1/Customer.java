package oops.inheritance.multilevel.task1;

public class Customer {
	
	int customerId;
	String customerName;
	int mobileNumber;
	
	Customer(int customerId , String customerName , int mobileNumber){
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
	}
	
	public void dispCustomer() {
		System.out.println("-------------- CUSTOMER DETAILS --------------");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Customer Mobile Number : " + mobileNumber);
	}
}
