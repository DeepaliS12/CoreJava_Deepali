package test;

import java.util.Scanner;

public class MyClass {
	public static void main(String args[])
	{
		System.out.println("Hello World");
		
		//---------Data types in Java-----
		
		int num1;
		int num2;
		
		num1 = 11;
		num2 = 10;
		
		int Sum = num1 +num2;
		float div = (float) num1/num2;
		
		System.out.println("Addition: " + Sum);
		System.out.println("Multiplication: " + null);
		System.out.println("Division:" + div);
		
		char a = 'a';
		float num3;
		double num4;
		
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("Enter the name of the user: ");
			String name = scanner.next();  //line will be captured
	
			
			System.out.println("Hello " + name);
			System.out.println("length: " + name.length());
			System.out.println("Upper Case: " + name.toUpperCase());
			
			//........Arrays.............
			
			int myarray[] = {2,3,4,5,6};
			String myarray1[] = {"a","b","c","d'"};
			System.out.println("Second value in Array: " + myarray[1]);
			System.out.println("Second value in Array: " + myarray1[1]);
					
			
			
			
	}

}
