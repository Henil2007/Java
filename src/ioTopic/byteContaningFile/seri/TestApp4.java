package ioTopic.byteContaningFile.seri;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestApp4 {

	public static void main(String[] args) {
		
		try
			(
				FileInputStream fin = new FileInputStream("D:\\Programing\\Java\\src\\ioTopic\\byteContaningFile\\seri\\procudtrecord.txt");
				ObjectInputStream oin = new ObjectInputStream(fin); 
			)
		{
			Product p = (Product)oin.readObject();
			
			System.out.println(p.getProductId() + " " + p.getName() + " " + p.getManufacturing() + " " + p.getPrice());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
