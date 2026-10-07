package ioTopic.byteContaningFile.seri;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestApp3 {
	public static void main(String[] args) {
		
		Product p = new Product(101, "TATA", "Punch", 1500);
		
		try
			(
				FileOutputStream fout = new FileOutputStream("D:\\Programing\\Java\\src\\ioTopic\\byteContaningFile\\seri/procudtrecord.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);
			)
		{
			out.writeObject(p);
			
			System.out.println("Success");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
