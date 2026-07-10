package ArrayBasics;
import java.util.Scanner;

public class ArrayDemo3 {
	public static void main(String args[]) {
		int arr[] = new int[10];
		int count = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter arr[" + i + "] : ");
			arr[i] = scan.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for(int j=1;j<=10;j++)
			{
				if(arr[i] % j == 0)
				{
					count ++;
				}
				if(count == 2)
				{
					System.out.println(arr[i]);
				}
			}
		}
		scan.close();
	}
}
