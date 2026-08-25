package string.methods;

public class TestApp4 {
	
	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 20;
		
		String value1 = String.valueOf(no1);
		String value2 = String.valueOf(no2);
		
		System.out.println(value1 + value2);
		
		no1 = Integer.parseInt(value1);
		no2 = Integer.parseInt(value2);
		
		System.out.println(no1+no2);
	}
}
