package oops.inheritance.multilevel;

public class TechEmployee extends Employee{
	
	String projectName;
	
	TechEmployee(int eid , String name , int salary , String dsgn , String orgName , String projectName) {
		
		super(eid, name, salary, dsgn, orgName);
		this.projectName = projectName;
	}
	
	public void dispData() {
		System.out.println(eid + " " + name + " " + salary + " " + dsgn + " " + orgName + " " + projectName);
	}
	
	public static void main(String[] args) {
		
		TechEmployee emp = new TechEmployee(101, "Henil", 100000, "IT", "Google", "Google Maps");
		
		emp.dispData();
	}
}
