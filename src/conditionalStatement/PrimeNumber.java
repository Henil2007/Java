package conditionalStatement;

import java.util.Scanner;

public class PrimeNumber 
{	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num;
		int count = 0;
		System.out.print("Enter number : ");
		num = scan.nextInt();
		
		for(int i=01;i<=num;i++)
		{
			if(num % i == 0)
			{
				count++;
			}
		}
		
		if(count == 2)
		{
			System.out.println(num + " is a Prime number.");
		}
		else
		{
			System.out.println(num + " is not a Prime number.");
		}
	}
}
