package ioTopic.characterContaningFile;

import java.io.FileWriter;
import java.util.Scanner;

public class TestApp4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		
		try (
				FileWriter fw = new FileWriter("D:\\Programing\\Java\\src\\ioTopic\\characterContaningFile/list.txt");
				) 
		{
			
			fw.write(name);
			
			fw.close();
			
			System.out.println("Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}
