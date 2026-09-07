package exception;

import java.util.Scanner;

public class TestApp7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();

		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();

		int ans = 0;

		try
		{
		    ans = no1 / no2; 

		    String name = "";
		    int length = name.length();
		    System.out.println("Length of String : " + length);

		    String value1 = "sd645";
		    String value2 = "ss54rr";


		    int ans1 = Integer.parseInt(value1) + Integer.parseInt(value2);

		    System.out.println("Addition : " + ans1);
		}
		catch(ArithmeticException | NullPointerException | NumberFormatException e)
		{
		    e.printStackTrace();
		    System.out.println("Catch Block Handled Exception");
		}
		catch(Exception e)
		{
		    e.printStackTrace();
		    System.out.println("Catch Block Handled Exception");
		}

		System.out.println("Ans : " + ans);
		
		sc.close();
	}
}
