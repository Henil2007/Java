package oops.polymorphism.compiletime;

public class Calculator {
	
	public void addFun(long no1 , long no2) {
		System.out.println("addFum(no1 + no2) : " + (no1 + no2));
	}
	public void addFun(Double no1 , Double no2) {
		System.out.println("DOUBLE addFum(no1 + no2) : " + (no1 + no2));
	}
	public void addFun(int no1 , int no2 , int no3) {
		System.out.println("INT addFum(no1 + no2 + no3) : " + (no1 + no2 + no3));
	}
	public void addFun(int no1 , int no2 , int no3 , int no4) {
		System.out.println("INT addFum(no1 + no2 + no3 + no4) : " + (no1 + no2 + no3 + no4));
	}
	
	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		
		obj.addFun('A' , 'B');
		obj.addFun(15215, 153218);
		obj.addFun(10, 20, 30);
		obj.addFun(10, 20, 30, 40);
	}
}
