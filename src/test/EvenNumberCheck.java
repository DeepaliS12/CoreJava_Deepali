package test;

import java.util.Scanner;

public class EvenNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();  //line will be captured
		
		if(number % 2 == 0)
		{ 
			System.out.println(number +" is even");
		}
			else
			{
				System.out.println(number +" is odd");
			}
		
	}

}
