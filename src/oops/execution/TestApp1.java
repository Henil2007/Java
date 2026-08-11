package oops.execution;

public class TestApp1 {
	
	static {
		System.out.println("static Block-1");
	}
	static {
		System.out.println("static Block-2");		
	}
	
	static void test1() {
		System.out.println("static method - test1()");
	}
	
	// Instance block 
	{
		System.out.println("Instance block -- 1");
	}
	{
		System.out.println("Instance block -- 2");
	}
	
	public TestApp1() {
		System.out.println("TestApp1 : Default constructor");
	}
	public TestApp1(int no) {
		System.out.println("TestApp1 : Para constructor");
	}
	
	void test2() {
		System.out.println("Non - static method : test2()");
	}
	
	public static void main(String[] args) {
		
		System.out.println("======== Main Start =======");
		
		TestApp1.test1();
		
		TestApp1 obj1 = new TestApp1();
		obj1.test2();
		
		System.out.println("-------------------------------------");
		
		TestApp1 obj2 = new TestApp1(100);
		
		obj2.test2();
		System.out.println("======== Main End =======");
	}
}
