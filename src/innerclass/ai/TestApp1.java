package innerclass.ai;

public class TestApp1 {
	
	public static void main(String[] args) {
		A objA = new A() 
		{
			@Override
			public void testApp1() {
				System.out.println("testApp1() : A");
			}
		};
		objA.testApp1();
	}
}
