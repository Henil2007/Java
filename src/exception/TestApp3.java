package exception;

public class TestApp3 {
	public static void main(String[] args) {
		
		// StringIndexOutOfBoundsException
		String name = "henil";
		
		try {
			System.out.println(name.charAt(5));			
		} 
		catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Exception handaled by catch block.");
		}
	}
}
