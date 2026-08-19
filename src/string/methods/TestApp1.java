package string.methods;

public class TestApp1 {
	
	public static void main(String[] args) {
		
		String name = "My name is Henil Patel";
		
		System.out.println("Length = " + name.length());
		
		for (int i = 0; i < name.length(); i++) {
			System.out.println("name.charAt("+i+")" + name.charAt(i));
		}
	}
}
