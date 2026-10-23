package collection.list;

import java.util.ArrayList;

public class TestApp9 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Henil");
        list.add("Ramesh");
        list.add("Suresh");
        list.add("Gita");
        list.add("Sita");
        list.add("Meeta");

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.println(obj);
        }

        list.remove(2); // Remove by index
        list.remove("Gita"); // By value

        list.add("Bhavya"); // Add at the end of the list
        list.add(2,"Ram"); // End at the specific index

        list.set(1,"Suresh"); // Update by index

        System.out.println("list.contains(\"Suresh\") : " + list.contains("Suresh"));

        list.addFirst("XYZ");
        list.addLast("ABC");

        list.clear();
        System.out.println("List size : " + list.size());

        System.out.println("===== UPDATED LIST =====");

        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.println(obj);
        }


    }
}
