package collection.list;

import java.util.ArrayList;

public class TestApp6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Henil");
        list.add("Dev");
        list.add("Danav");
        list.add("Ramesh");
        list.add("Suresh");
        list.add("gita");
        list.add("Sita");
//        list.add(12); Error Type specific Array list

        System.out.println("Size : " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("List(" + i + ")"+list.get(i));
        }
    }
}
