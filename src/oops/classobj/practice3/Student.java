package oops.classobj.practice3;

import java.util.Scanner;

public class Student {

    private int rno;
    private String name;
    private int std;
    private int marks;

    void scanData() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Roll no : ");
        rno = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter name : ");
        name = scan.nextLine();
        System.out.println("Enter standard : ");
        std = scan.nextInt();
        System.out.println("Enter marks : ");
        marks = scan.nextInt();

//        scan.close();
    }

    void displayData() {
        System.out.println(rno + "  " + name + "  " + std + "  " + marks);
    }
}
