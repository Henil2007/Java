package collection.set;

import java.util.HashSet; // It does not maintain insertion order and remove duplicate element
import java.util.Iterator;

public class TestApp1 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();

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
