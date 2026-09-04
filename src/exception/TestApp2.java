package exception;

public class TestApp2 {
	public static void main(String[] args) {
		
		// arrayIndexOutOfBound
		int arr[] = new int[5];
		
		try {
			arr[5] = 0;
			System.out.println("arr[5] = " + arr[5]); 			
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Exception handeled by catch block.");
		}
		
	}
}
