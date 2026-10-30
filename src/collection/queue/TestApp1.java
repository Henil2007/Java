package collection.queue;

import java.util.PriorityQueue;

public class TestApp1 {

    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<String>();

        // It does not remove duplicate elements.

        queue.add("Amit");
        queue.add("Ramesh");
        queue.add("Suresh");
        queue.add("Mahesh");
        queue.add("Ganesh");
        queue.add("Gita");
        queue.add("Sita");
//        queue.add("Amit");

        while (!queue.isEmpty()) { // By default it provides output in natural order
            String name = queue.poll();
            System.out.println(name);
        }
    }
}
