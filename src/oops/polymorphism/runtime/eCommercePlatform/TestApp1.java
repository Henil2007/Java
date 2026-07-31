package oops.polymorphism.runtime.eCommercePlatform;

import java.util.Scanner;

public class TestApp1 {
	
	public static void geteCommercePlatform(User user) {
		user.usePortal();
		
		if (user instanceof Customer) {
			Customer customer = (Customer) user;
			customer.placeOrder();
		}
		else if (user instanceof Seller) {
			Seller seller = (Seller) user;
			seller.addProduct();
		}
		else if (user instanceof DeliveryBoy) {
			DeliveryBoy delivery = (DeliveryBoy) user;
			delivery.deliverProduct();
		}
		else if (user instanceof Admin) {
			Admin admin = (Admin) user;
			admin.manageSystem();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice;
		
		while (true) {
			System.out.println();
			System.out.println("1. Customer");
			System.out.println("2. Seller");
			System.out.println("3. Delivery Boy");
			System.out.println("4. Admin");
			System.out.println("5. Exit");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			
			switch (choice)
			{
			case 1: Customer customer = new Customer();
					geteCommercePlatform(customer);
					break;
			case 2: Seller seller = new Seller();
					geteCommercePlatform(seller);
					break;
			case 3: DeliveryBoy delivery = new DeliveryBoy();
					geteCommercePlatform(delivery);
					break;
			case 4: Admin admin = new Admin();
					geteCommercePlatform(admin);
					break;
			case 5: System.exit(0);
			}
		}
	}
}
