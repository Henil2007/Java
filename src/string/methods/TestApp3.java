package string.methods;

import java.util.Scanner;

public class TestApp3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string 1 : ");
		String s1 = sc.nextLine();
		System.out.println("Enter string 2 : ");
		String s2 = sc.nextLine();
		
//		if(s1.equals(s2)) {
//		if(s1.equalsIgnoreCase(s2)) { // IgnorCase will ignore the case of the input string
		
//		if(s1.compareTo(s2) == 0) {
		if(s1.compareToIgnoreCase(s2) == 0) {
			System.out.println("Both string are equal.");
		}
		else {
			System.out.println("Both string are not equal.");
		}
		
		sc.close();
	}
}
