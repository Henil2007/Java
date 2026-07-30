package oops.polymorphism.runtime.hospitalManagementSystem;

import java.util.Scanner;

public class TestApp1 {
	
	public static void getHospitalManagementsystem(HospitalPerson hospital) {
		hospital.performDuty();
		
		if (hospital instanceof Doctor) {
			Doctor doctor = (Doctor) hospital;
			doctor.pescribeMedicine();
		}
		else if (hospital instanceof Nurse) {
			Nurse nurse = (Nurse) hospital;
			nurse.assistPatient();
		}
		else if (hospital instanceof Receptionist) {
			Receptionist receptionist = (Receptionist) hospital;
			receptionist.bookAppointment();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while (true) {
			System.out.println();
			System.out.println("1. Doctor");
			System.out.println("2. Nurse");
			System.out.println("3. Receptionist");
			System.out.println("4. Exit");
			System.out.println("Enter your Choice : ");
			choice = sc.nextInt();
			
			switch (choice)
			{
			case 1: Doctor doctor = new Doctor();
					getHospitalManagementsystem(doctor);
					break;
			case 2: Nurse nurse = new Nurse();
					getHospitalManagementsystem(nurse);
					break;
			case 3: Receptionist receptionist = new Receptionist();
					getHospitalManagementsystem(receptionist);
					break;
			case 4: System.exit(0);
			}
		}
//		sc.close();
	}
}
