package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp3 {
	
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
		
		// 3. By Iterator (I) [Forward Direction]
		
		Iterator<String> itr = list.iterator();
		
		while (itr.hasNext()) {
			Object obj = itr.next();
			
			if (obj instanceof Student) {
				s = (Student)obj;
				System.out.println(s.getRno() + " " + s.getName() + " " + s.getStd() + " " + s.getMarks());
			}
			else {
				System.out.println(obj);
			}
		}
		
	}
}
