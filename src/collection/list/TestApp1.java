package collection.list;

import java.util.ArrayList;

public class TestApp1 {

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
		
		// 1. Standard For loop
		
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			
			System.out.println(obj);
		}
	}

}
