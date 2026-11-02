package collection.sortingTechniques;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Sumit");
        list.add("Ramesh");
        list.add("Ganesh");
        list.add("Amit");
        list.add("Gita");
        list.add("Sita");

        System.out.println("Before Sorting : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Sorting
        Collections.sort(list);

        System.out.println("After sorting : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
