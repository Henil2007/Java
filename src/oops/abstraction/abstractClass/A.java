package oops.abstraction.abstractClass;

public abstract class A {
	
	int no;
	
	A(){
		System.out.println("-------------- Abstract class default constructor called --------------");
		no = 100;
	}
	
	public abstract void test1();
	public abstract void test2();
	public abstract void test3();
	
	public void test4() {
		System.out.println("A : Test4");
	}
	public void test5() {
		System.out.println("A : Test5");
	}
	public void test6() {
		System.out.println("A : Test6");
	}
}
