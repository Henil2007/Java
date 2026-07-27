package oops.inheritance.multilevel.task1;

public class DeliveryOrder extends Order{
	
	String deliveryPartner;
	int deliverycharge;
	
	DeliveryOrder(int customerId , String customerName , int mobileNumber , int orderId , String foodItems , int quantity , int pricePerItem , String deliveryPartner , int deliverycharge) {
		
		super(customerId, customerName, mobileNumber, orderId, foodItems, quantity, pricePerItem);
		this.deliveryPartner = deliveryPartner;
		this.deliverycharge = deliverycharge;
	}
	
	public void dispDelivery() {
		System.out.println("-------------- DELIVERY DETAILS --------------");
	}
	
	public void calculateFinalAmount() {
		System.out.println("Delivery Partner : " + deliveryPartner);
		System.out.println("Delivery charges : " + deliverycharge);
		System.out.println("Total Bill = " + ((quantity * pricePerItem) + deliverycharge));
	}
	
	public static void main(String[] args) {
		
		DeliveryOrder delivery = new DeliveryOrder(101, "Henil", 98554222, 2251, "PIZZA", 2, 250, "Zomato", 40);
		
		delivery.dispCustomer();
		delivery.calculateBill();
		delivery.dispOrder();
		delivery.dispDelivery();
		delivery.calculateFinalAmount();
	}
}p
