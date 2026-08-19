package string.immutable;

public class TestApp3 {
	
	public static void main(String[] args) {
		String name = "Henil";
		
		System.out.println(name + "---- name = " + name.hashCode());
		
		name = name.concat(" Patel");
		
		System.out.println(name + "---- name = " + name.hashCode());
		
		StringBuffer sb = new StringBuffer("Henil");
//		StringBuilder sb = new StringBuilder("Henil"); 
		// We can use any of them string builder or string buffer
		
		System.out.println(sb + "--- sb = " + sb.hashCode());
		
		sb = sb.append(" Patel");
		
		System.out.println(sb + "--- sb = " + sb.hashCode());
	}
}
