package oops.polymorphism.runtime.bankCustomer;

import java.util.Scanner;

public class TestApp1 {
	
	public static void getCustomerBasedService(Customer customer) {
		customer.getService();
		
		if(customer instanceof SavingsCustomer) {
			SavingsCustomer saving = (SavingsCustomer) customer;
			saving.getPassbook();
		}
		else if (customer instanceof CurrentCustomer) {
			CurrentCustomer current = (CurrentCustomer) customer;
			current.getChequeBook();
		}
		else if (customer instanceof LoanCustomer) {
			LoanCustomer loan = (LoanCustomer) customer;
			loan.getLoanDetails();
		} 
		else if (customer instanceof PremiumCustomer) {
			PremiumCustomer premium = (PremiumCustomer) customer;
			premium.getLoungeAccess();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while (true) {
			
			System.out.println("1. Saving a/c Customer");
			System.out.println("2. Current a/c Customer");
			System.out.println("3. Loan a/c Customer");
			System.out.println("4. Premium a/c Customer");
			System.out.println("5. Exit");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			
			switch (choice) 
			{
			case 1: SavingsCustomer saving = new SavingsCustomer();
					getCustomerBasedService(saving);
					break;
			case 2: CurrentCustomer current = new CurrentCustomer();
					getCustomerBasedService(current);
					break;
			case 3: LoanCustomer loan = new LoanCustomer();
					getCustomerBasedService(loan);
					break;
			case 4: PremiumCustomer premium = new PremiumCustomer();
					getCustomerBasedService(premium);
					break;
			case 5: System.exit(0);
			}
		}
		
	}
}
