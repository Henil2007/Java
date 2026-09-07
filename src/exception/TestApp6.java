package exception;

public class TestApp6 {
	public static void main(String[] args) {
		// NullPointerException
		String name = null;
		try {
			System.out.println(name.length());			
		} 
		catch (NullPointerException e) {
			System.out.println("Exception handled by catch block");
		}
	}
}
