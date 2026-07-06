package loopBasics;
import java.util.Scanner;

public class LooopDemo1 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.print("Enter number : ");
		num = scan.nextInt();
		
		for(int i=0 ; i<= 10 ; i++)
		{
			System.out.println(num + " X " + i + " = " + (num * i));
		}
	}

}
