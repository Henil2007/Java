package collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet; // It maintain insertion order and removes duplicate elements

public class TestApp2 {

    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<String>();

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
