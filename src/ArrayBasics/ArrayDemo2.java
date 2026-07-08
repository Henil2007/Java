package ArrayBasics;
import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter a[" + i + "] : ");
			arr[i] = scan.nextInt();
		}
		// End of first loop
//		System.out.print("Even number : ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				sum = sum + arr[i];
			}
			else {
				System.out.println("Odd : " + arr[i]);
			}
		}
		// End of second loop
		System.out.println("Even sum = " + sum);
	}
}
