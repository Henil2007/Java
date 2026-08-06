package oops.abstraction.interfaceclass.task1;

public interface A {
	
//	1. Constant variable public static final.
	int NO = 100;
	
	public abstract void test1();
	public abstract void test2();
	public abstract void test3();
	
	static void test4() {
		System.out.println("A - Static - test4()");
	}
	default void test5() {
		System.out.println("A - Default - test5()");
		test6();
	}
	private void test6() {
		System.out.println("A - Private - test6()");
	}
}
