package oops.constructor.practice;

public class Product {
	
	private int productId;
	private String productName;
	private String brand;
	private int price;
	private int quantity;
	
	Product(){
		
		System.out.println("DEFAULT : CONSTRUCTOR");
		
		productId = 0;
		productName = null;
		brand = null;
		price = 0;
		quantity = 0;
	}
	
	Product(int productId , String productName , String brand , int price , int quantity){
		
		System.out.println("PARAMETERISED : CONSTRUCTOR");
		
		System.out.println("BEFORE : " + this.productId + " " + this.productName + " " + this.brand + " " + this.price + " " + this.quantity);
		
		this.productId = productId;
		this.productName = productName;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		
		System.out.println("AFTER : " + this.productId + " " + this.productName + " " + this.brand + " " + this.price + " " + this.quantity);		
	}
	
	Product(Product p){
		System.out.println("COPY : CONSTRUCTOR");
		
		System.out.println("BEFORE : " + this.productId + " " + this.productName + " " + this.brand + " " + this.price + " " + this.quantity);
		
		this.productId = p.productId;
		this.productName = p.productName;
		this.brand = p.brand;
		this.price = p.price;
		this.quantity = p.quantity;
		
		System.out.println("AFTER : " + this.productId + " " + this.productName + " " + this.brand + " " + this.price + " " + this.quantity);		
	}
	
	public void displayData() {
		
		System.out.println("=====DISPLAY DATA FUNCTION=====");
		
		System.out.println(productId + " " + productName + " " + brand + " " + price + " " + quantity);
		
	}
	
	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product(101,"Laptop","DELL",55000,10);
		Product p3 = new Product(p2);
		
		p1.displayData();
		p2.displayData();
		p3.displayData();		
	}
}
