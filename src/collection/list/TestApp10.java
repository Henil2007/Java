package collection.list;

import java.util.Iterator;
import java.util.Vector;

public class TestApp10 {

    public static void main(String[] args) {
        Vector<String> list = new Vector<String>();

        list.add("Ramesh");
        list.add("Suresh");
        list.add("Ganesh");
        list.add("Gita");
        list.add("Sita");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            String name = (String) itr.next();
            System.out.println(name);
        }
    }
}
