package oopsConcepts;

public class RunnerClass {
	
	public static void main(String args[])
	{
	/*ClassA Emp1 = new ClassA();
	
	Emp1.Name = "Smith";
	Emp1.salary = 100000;
	Emp1.OrgName = "ABC";
	
	Emp1.Display();    */
		
		MethodOverloading obj3 = new MethodOverloading();
		obj3.add(1, 2);
		obj3.add(1.5, 2.1);
		
		MethodOverrideChild obj4 = new MethodOverrideChild();
		obj4.display();
		
		AbstractChild obj5 = new AbstractChild();
		obj5.method1();
		obj5.method2();
		
		InterfaceChild obj6 = new InterfaceChild();
		obj6.method1();
		
		EncapsulationExample obj7 = new EncapsulationExample();
		obj7.setSalary(1000);
		System.out.println(obj7.getSalary());
		
		

}
}
