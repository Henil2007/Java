package collection.sortingTechniques;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(100);
        list.add(20);
        list.add(200);
        list.add(0);

        System.out.println("Before sorting : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // After sorting
        Collections.sort(list);

        System.out.println("After sorting : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
