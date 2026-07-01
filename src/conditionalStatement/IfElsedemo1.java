package conditionalStatement;
import java.util.Scanner;

public class IfElsedemo1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
	int no1,no2,no3;
	
	System.out.print("Enter no 1 : ");
	no1 = scan.nextInt();

	System.out.print("Enter no 2 : ");
	no2 = scan.nextInt();

	System.out.print("Enter no 3 : ");
	no3 = scan.nextInt();

	if(no1 > no2)
	{
		if(no1 > no3)
		{
			System.out.println("Maximum no = " + no1);
		}
		else
		{
			System.out.println("Maximum no = " + no3);
		}
	}
	else
	{
		if(no2 > no3)
		{
			System.out.println("Maximum no = " + no2);
		}
		else
		{
			System.out.println("Maximum no = " + no3);
		}
	}        
    }
}
