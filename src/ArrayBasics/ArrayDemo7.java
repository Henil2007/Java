package ArrayBasics;

import java.util.Scanner;

public class ArrayDemo7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[5][6];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				System.out.print("Enter arr[" + i +"][" + j + "] : ");
				arr[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i][5] = 0;
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][5] += arr[i][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("arr[" + i + "][5] : "+arr[i][5]);
		}
		
		
		
		scan.close();
	}
}
