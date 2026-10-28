package collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestApp11 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

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
