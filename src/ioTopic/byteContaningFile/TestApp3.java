package ioTopic.byteContaningFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestApp3 {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("D:\\Programing\\Java\\src\\ioTopic\\byteContaningFile\\TestApp2.java");
			FileOutputStream fout = new FileOutputStream("D:\\Programing\\Java\\src\\ioTopic\\byteContaningFile\\DupTestApp2.java");
			
			int temp;
			
			while ((temp = fin.read()) != -1) {
				System.out.print((char)temp);
				fout.write(temp);
			}
			
			fin.close();
			fout.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
