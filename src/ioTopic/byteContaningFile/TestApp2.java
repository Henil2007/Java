package ioTopic.byteContaningFile;

import java.io.FileInputStream;
//import java.util.Scanner;

public class TestApp2 {
	
	public static void main(String[] args) {
		
		FileInputStream fin = null;
		StringBuilder sb = new StringBuilder();
		
		try {
			fin = new FileInputStream("D:\\Programing\\Java\\src\\ioTopic\\byteContaningFile\\demo1.txt");
			
			int temp;
			
			while((temp = fin.read()) != -1) {
				sb.append((char)temp);
			}
			
			fin.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(sb);
		
	}
}
