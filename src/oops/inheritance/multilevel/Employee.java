package oops.inheritance.multilevel;

public class Employee extends Person{
	int eid;
	int salary;
	String dsgn , orgName;
	
	Employee(int eid,String name, int salary,String dsgn , String orgName) {
		
		super(name);
		this.eid = eid;
		this.salary = salary;
		this.dsgn = dsgn;
		this.orgName = orgName;
	}
}
