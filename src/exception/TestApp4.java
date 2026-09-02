package exception;

import java.util.Scanner;

public class TestApp4 {
	public static void main(String[] args) {
		// InputMismatchException
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entr number : ");
		num = sc.nextInt();
		
		System.out.println("Num = " + num);
		
		sc.close();
	}
}
