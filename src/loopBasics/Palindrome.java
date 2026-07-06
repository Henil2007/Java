package loopBasics;
import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num;
		int sum = 0 , temp , r;
		System.out.print("Enter number : ");
		num = scan.nextInt();
		
		temp = num;
		
		while(temp > 0)
		{
			r = temp % 10;
			sum = sum + r;
			temp = temp / 10;
		}
		if(sum == num)
		{
			System.out.println("It is Palindrom Number");
		}
		else
		{
			System.out.println("It is not a Plaindrom Number");
		}
		
	}

}
