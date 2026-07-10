package ArrayBasics;

import java.util.Scanner;

public class ArrayDemo5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[3][3];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Enter arr["+ i + "][" + j + "] : ");
				arr[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}
