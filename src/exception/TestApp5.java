package exception;

import java.util.Scanner;

public class TestApp5 {
	
	public static void main(String[] args) {
		
		// NumberFormatException
		String value;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter value : ");
			value = sc.nextLine();
			
			int value1 = Integer.parseInt(value);
			
			System.out.println("Integer value : " + value1);			
		} 
		catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Exception handeled by catch block.");
		}
		
		
		sc.close();
	}
}
