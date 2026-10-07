package ioTopic.byteContaningFile.seri;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestApp1 {
	
	public static void main(String[] args) {
		
		Student s = new Student(1, "Henil", 12, 100);
		Student s1 = new Student(2, "Dev", 12, 100);
		
		try
			(
				FileOutputStream fout = new FileOutputStream("D:\\Programing\\Java\\src\\ioTopic\\byteContaningFile\\seri/record.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);
			)
		{
			out.writeObject(s);
			out.writeObject(s1);
			
			System.out.println("Success");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
