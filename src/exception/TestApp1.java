package exception;

import java.util.Scanner;

public class TestApp1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no1,no2 , ans;
		
		System.out.println("Enter No1. : ");
		no1 = sc.nextInt();
		System.out.println("Enter No2. : ");
		no2 = sc.nextInt();
		
		try {
			ans = no1 / no2;	
			System.out.println("Answer = " + ans);
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Exception handeled by catch Bolck.");
		}
				
		sc.close();
	}
}
