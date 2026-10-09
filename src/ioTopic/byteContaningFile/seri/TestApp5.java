package ioTopic.byteContaningFile.seri;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestApp5 {
	public static void main(String[] args) {
		
		Student s[] = {
				new Student(101, "Henil", 12, 100),
				new Student(102, "Dev", 11, 99),
				new Student(103, "Ved", 10, 90),
				new Student(104, "Rahul", 9, 100)
		};
		
		try
			(
				FileOutputStream fout = new FileOutputStream("D:\\Programing\\Java\\src\\ioTopic\\byteContaningFile\\seri/data.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);
			)
		{
			out.writeObject(s);
			
			System.out.println("Success");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
