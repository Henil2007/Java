package oops.classobj.practice2;

import java.util.Scanner;

public class Student {

    int rno;
    String name;
    int std;
    int marks;

    void scanData(){
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
    }

    void displayData(){
        System.out.println(rno + "  " + name + "  " + std + "  " + marks);
    }
}
