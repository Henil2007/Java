package oops.classobj.practice1;

import java.util.Scanner;

public class TestApp1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Student obj = new Student();
        Student obj1 = new Student();
        Student obj2 = new Student();

        System.out.println("Enter Roll no. : ");
        obj.rno = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter name : ");
        obj.name = scan.nextLine();
        System.out.println("Enter standard : ");
        obj.std = scan.nextInt();
        System.out.println("Enter marks : ");
        obj.marks = scan.nextInt();

        System.out.println("Enter Roll no : ");
        obj1.rno = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter name : ");
        obj1.name = scan.nextLine();
        System.out.println("Enter standard : ");
        obj1.std = scan.nextInt();
        System.out.println("Enter marks : ");
        obj1.marks = scan.nextInt();

        System.out.println("Enter Roll no : ");
        obj2.rno = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter name : ");
        obj2.name = scan.nextLine();
        System.out.println("Enter standard : ");
        obj2.std = scan.nextInt();
        System.out.println("Enter marks : ");
        obj2.marks = scan.nextInt();

        System.out.println();
        System.out.println("Student1 Details : ");
        System.out.println("Roll no : " + obj.rno);
        System.out.println("Name : " + obj.name);
        System.out.println("Standard : " + obj.std);
        System.out.println("Marks : " + obj.marks);

        System.out.println();
        System.out.println("Student2 Details : ");
        System.out.println("Roll no : " + obj1.rno);
        System.out.println("Name : " + obj1.name);
        System.out.println("Standard : " + obj1.std);
        System.out.println("Marks : " + obj1.marks);

        System.out.println();
        System.out.println("Student3 Details : ");
        System.out.println("Roll no : " + obj2.rno);
        System.out.println("Name : " + obj2.name);
        System.out.println("Standard : " + obj2.std);
        System.out.println("Marks : " + obj2.marks);

        scan.close();
    }
}
