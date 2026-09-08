package exception;

import java.util.Scanner;

public class TestApp11 {
	
		public static void isValidForVoat(int age) throws ArithmeticException  {
			if (age < 18) {
				throw new ArithmeticException("Invalid Age\nEnter a valid age");
			}
			else {
				System.out.println("Welocme for vote");
			}
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int age;
			System.out.println("Enter age : ");
			age = sc.nextInt();
			
			try {
				isValidForVoat(age);
				
			} 
			catch (ArithmeticException e) {
				e.printStackTrace();
			}
			
			sc.close();
		}
}