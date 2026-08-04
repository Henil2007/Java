package oops.abstraction.abstractClass.problamStatement;

import java.util.Scanner;

public class TestApp1 {

    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("1. Doctor");
            System.out.println("2. Nurse");
            System.out.println("3. Patient");
            System.out.println("4. Receptionist");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");
            choice = scan.nextInt();

            switch (choice){
                case 1: Doctor d = new Doctor();
                        d.performDuty();
                        d.prescribeMedicine();
                        break;

                case 2: Nurse n = new Nurse();
                        n.performDuty();
                        n.assistPatient();
                        break;

                case 3: Patient p = new Patient();
                        p.performDuty();
                        p.getTretement();
                        break;

                case 4: Receptionist r = new Receptionist();
                        r.performDuty();
                        r.bookAppointment();
                        break;

                case 5: System.exit(0);
            } // end of switch
        } // end of while

    } // end of main
} // end of class
