package ioTopic.characterContaningFile;

import java.io.FileReader;
import java.io.FileWriter;

public class TestApp3 {
	
	public static void main(String[] args) {
		
		int temp;
		
		try {
			FileReader fr = new FileReader("D:\\Programing\\Java\\src\\ioTopic\\characterContaningFile\\TestApp2.java");
			FileWriter fw = new FileWriter("D:\\Programing\\Java\\src\\ioTopic\\characterContaningFile/Test2.txt");
			
			while ((temp = fr.read()) != -1) {
				fw.write((char)temp);
			}
			
			fr.close();
			fw.close();
			
			System.out.println("Success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
