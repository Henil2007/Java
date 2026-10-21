package collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestApp4 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("Henil");
		list.add(123);
		list.add(12L);
		list.add(false);
		list.add(12.23);
		list.add('c');
		
		Student s = new Student(1, "Henil", 12, 100);
		
		list.add(s);
		
		System.out.println("Size : " + list.size());
		
		// Using Iterable in both forward and backward Direction
		
		ListIterator itr = list.listIterator();
		
		System.out.println("===== Forward Direction =====");
		
		while (itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
		}
		
		System.out.println("===== Backward Direction =====");
		
		while (itr.hasPrevious()) {
			Object obj = itr.previous();
			System.out.println(obj);
		}
	}
}
