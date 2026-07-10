package ArrayBasics;

import java.util.Scanner;

public class ArrayDemo6 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[3][3];
		int rsum , csum;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Enter arr[" + i + "][" + j +"] : ");
				arr[i][j] = scan.nextInt();
			}
		}
		// for Row sum
		for (int i = 0; i < arr.length; i++) {
			rsum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				rsum = arr[i][j] + rsum;
			}
			
			System.out.println("Row " + (i+1) +" Sum = " + rsum);
		}
		// for column sum
		for (int i = 0; i < arr.length; i++) {
			csum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				csum += arr[j][i];
			}
			System.out.println("Column " + (i + 1) + " Sum = " + csum);
		}
		scan.close();
	}
}
