package oops.polymorphism.runtime.universityPortal;

import java.util.Scanner;

public class TestApp1 {
	
	public static void getUniversityPortal(UniversityMember university) {
		university.Work();
		
		if (university instanceof Student) {
			Student student = (Student) university;
			student.viewResult();
		}
		else if (university instanceof Faculty) {
			Faculty faculty = (Faculty) university;
			faculty.takeLecture();
		}
		else if (university instanceof HOD) {
			HOD hod = (HOD) university;
			hod.approveLeave();
		}
		else if (university instanceof Librarian) {
			Librarian librarian = (Librarian) university;
			librarian.issueBook();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while (true) {
			System.out.println();
			System.out.println("1. Student");
			System.out.println("2. Faculty");
			System.out.println("3. HOD");
			System.out.println("4. Librarian");
			System.out.println("5. Exit");
			System.out.println("Enter the choice : ");
			choice = sc.nextInt();
			
			switch (choice)
			{
			case 1: Student student = new Student();
					getUniversityPortal(student);
					break;
			case 2: Faculty faculty = new Faculty();
					getUniversityPortal(faculty);
					break;
			case 3: HOD hod = new HOD();
					getUniversityPortal(hod);
					break;
			case 4: Librarian librarian = new Librarian();
					getUniversityPortal(librarian);
					break;
			case 5: System.exit(0);
			}
			
		}
	}
}
