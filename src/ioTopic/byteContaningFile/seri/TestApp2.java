package ioTopic.byteContaningFile.seri;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestApp2 {

	public static void main(String[] args) {
		
		try
			(
					FileInputStream fin = new FileInputStream("D:\\Programing\\Java\\src\\ioTopic\\byteContaningFile\\seri\\record.txt");
				
					ObjectInputStream oin = new ObjectInputStream(fin);
			)
		{
			Student s = (Student)oin.readObject();
			Student s1 = (Student)oin.readObject();
			
			System.out.println(s.getRno() + " " + s.getName() + " " + s.getStd() + " " + s.getMarks());
			System.out.println(s1.getRno() + " " + s1.getName() + " " + s1.getStd() + " " + s1.getMarks());
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
