package oops.inheritance.multilevel.task1;

public class Order extends Customer{
	
	int orderId;
	String foodItems;
	int quantity;
	int pricePerItem;
	
	Order(int customerId , String customerName , int mobileNumber , int orderId , String foodItems , int quantity , int pricePerItem){
		
		super(customerId, customerName, mobileNumber);
		this.orderId = orderId;
		this.foodItems = foodItems;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	public void calculateBill() {
		System.out.println("-------------- ORDER DETAILS --------------");
	}
	public void dispOrder() {
		System.out.println("Order Id : " + orderId);
		System.out.println("Food Item : " + foodItems);
		System.out.println("Quantity : " + quantity);
		System.out.println("Price Per Item: " + pricePerItem);
		System.out.println("Total Bill = " + (quantity * pricePerItem));
	}
}
