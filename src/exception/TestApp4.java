package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestApp4 {
	public static void main(String[] args) {
		// InputMismatchException
		int num;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Entr number : ");
			num = sc.nextInt();
			
			System.out.println("Num = " + num);			
		} 
		catch (InputMismatchException e) {		
			e.printStackTrace();
			System.out.println("Exception handeled by catch Block");
		}
		
		sc.close();
	}
}
