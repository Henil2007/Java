package collection.set;

import java.util.Iterator;
import java.util.TreeSet; // It maintain ascending order and remove duplicate elements

public class TestApp3 {

    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<String>();

        set.add("Amit");
        set.add("Sumit");
        set.add("Gita");
        set.add("Sita");
        set.add("Amit");

        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            String name = (String) itr.next();
            System.out.println(name);
        }
    }
}
