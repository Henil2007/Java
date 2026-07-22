package oops.inheritance.simple.constructor;

public class Person {
	
	String name;
	
	public Person(){
		System.out.println("PERSON : DEFAULT Constructor");
		name = null;
	}

	public Person(String name) {
		System.out.println("PERSON : PARA Constructor");
		this.name = name;
	}
	
}
