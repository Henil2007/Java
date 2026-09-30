package ioTopic.byteContaningFile;

import java.io.FileOutputStream;
import java.util.Scanner;

public class TestApp1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter name : ");
		name = sc.nextLine();
		
		byte b[] = name.getBytes();
		
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("src/ioTopic/byteContaningFile/demo1.txt");
			
			fout.write(b);
			
			fout.close();
			
			System.out.println("Success");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}
