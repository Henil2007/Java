package string.methods;

public class TestApp5 {
	public static void main(String[] args) {
		String value = "This is Java Programing language";
		
		String word[] = value.split("\\s");
		
		for (int i = 0; i < word.length; i++) {
			System.out.println("Word["+i+"] : " + word[i]);
		}
	}
}
