package oops.abstraction.interfaceclass.task1;

public abstract class B implements A{

	@Override
	public void test1() {
		System.out.println("B - test1()");
	}

	@Override
	public void test2() {
		System.out.println("B - test2()");
	}

	@Override
	public void test3() {
		System.out.println("B - test3()");
	}
	
	public abstract void test7();
	public abstract void test8();

}
