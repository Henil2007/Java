package oops.constructor.practice;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	private String dsgn;
	private String orgName;
	
	Employee(){
		System.out.println("===== START : DEFAULT Constructor =====");
		
		id = 0;
		name = null;
		salary = 0;
		dsgn = null;
		orgName = null;
	}
	
	Employee(int id , String name , int salary , String dsgn , String orgName){
		this(id,name,salary,dsgn);
		System.out.println("===== START : PARA FOUR Constructor =====");
		
		this.orgName = orgName;
	}
	
	Employee(int id , String name , int salary , String dsgn){
		this(id,name,salary);
		System.out.println("===== START : PARA FOUR Constructor =====");
		
		this.dsgn = dsgn;
	}
	
	Employee(int id , String name , int salary){
		this(id,name);
		System.out.println("===== START : PARA FOUR Constructor =====");
		
		this.salary = salary;
	}
	
	Employee(int id , String name){
		this(id);
		System.out.println("===== START : PARA FOUR Constructor =====");
		
		this.name = name;
	}
	
	Employee(int id){
		
		this();
		System.out.println("===== START : PARA FOUR Constructor =====");
		
		this.id = id;
	}
	
	public void dispData() {
		
		System.out.println("Employee ID : " + id);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee salary: " + salary);
		System.out.println("Employee dsgn: " + dsgn);
		System.out.println("Employee orgName: " + orgName);
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Henil",50000,"IT","Oracle");
		
		e1.dispData();
	}
}
