package ioTopic.byteContaningFile;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.util.Scanner;

public class StudentDataBackup {
	
	public static void addStudent() {
		int student_id;
		String student_name;
		String course;
		int phone_no;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Id : ");
		student_id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Studetn name : ");
		student_name = sc.nextLine();
		System.out.println("Enter course name : ");
		course = sc.nextLine();
		System.out.println("Enter Phone number : ");
		phone_no = sc.nextInt();
		
		String information = student_id + " " + student_name + " " + course + " " + phone_no;
		byte info[] = information.getBytes();
		
		try {
			FileOutputStream fout = new FileOutputStream("src/ioTopic/byteContaningFile/StudentData.txt");
			
			fout.write(info);
			
			fout.close();
			
			System.out.println("Data Added Successfully...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		sc.close();
	}
	
	public static void readStudent() {
		try {
			FileInputStream fin = new FileInputStream("D:\\Programing\\Java\\src\\ioTopic\\byteContaningFile\\StudentData.txt");
			int temp;
			while ((temp = fin.read()) != -1) {
				System.out.print((char)temp);
			}
			
			fin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void BackupData() {
		try {
			FileInputStream fin = new FileInputStream("D:\\Programing\\Java\\src\\ioTopic\\byteContaningFile\\StudentData.txt");
			FileOutputStream fout = new FileOutputStream("D:\\Programing\\Java\\src\\ioTopic\\byteContaningFile\\StudentDataBackup.txt");
			
			int temp;
			while ((temp = fin.read()) != -1) {
				fout.write(temp);
			}
			
			System.out.println("Backup completed Successfully...");
			
			fin.close();
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Add Student");
			System.out.println("2. Read Student Data");
			System.out.println("3. Backup Data");
			System.out.println("4. Exit");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			
			switch (choice) 
			{
			case 1: addStudent();
					break;
			case 2: readStudent();
					break;
			case 3: BackupData();
					break;
			case 4: System.exit(0);
			
			}
		}
	}
}
