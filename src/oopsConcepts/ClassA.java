package oopsConcepts;

public class ClassA {
	
	public int salary;
	public String Name;
	public String OrgName;
	
	public ClassA() {
		
		System.out.println("Inside Constructor");
	}
	
	
	public ClassA(int val1, String val2, String val3) {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Parametrized Constructor");
		
		this.salary = val1;
		this.Name = val2;
		this.OrgName = val3;
		
	}


	public void Display() {
		System.out.println("Salary of the Emp:"+ salary);
		System.out.println("Name of the Emp:" + Name);
		System.out.println("Name of the Org:"+ OrgName);
		
		
	}
	

}
