
package collection.sortingTechniques;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp5 {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Henil", 12, 100);
        Student s2 = new Student(2, "Amit", 10, 50);
        Student s3 = new Student(3, "Sumit", 12, 60);
        Student s4 = new Student(4, "Gita", 11, 75);
        Student s5 = new Student(5, "Sita", 10, 90);

        ArrayList<Student> list = new ArrayList<Student>();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        System.out.println("Unsorted data:");

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getRno() + " " + s.getName() + " " + s.getStd() + " " + s.getMarks());
        }

        // Sorting
        Collections.sort(list,new StandardWiseComparator());

        System.out.println("Standard wise sorted data :");

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getRno() + " " + s.getName() + " " + s.getStd() + " " + s.getMarks());
        }
    }
}
