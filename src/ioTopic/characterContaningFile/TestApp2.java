package ioTopic.characterContaningFile;

import java.io.FileReader;
import java.util.Scanner;

public class TestApp2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int temp;
		
		try {
			FileReader fr = new FileReader("D:\\Programing\\Java\\src\\ioTopic\\characterContaningFile\\list.txt");
			
			while ((temp = fr.read()) != -1) {
				System.out.print((char)temp);
			}
			
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}
