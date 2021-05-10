package test;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		int temp;
		boolean isPrime = true;
		for(int i = 2;i<=number/2;i++)
		{
			temp = number%i;
			if(temp==0)
			{
				isPrime = false;
				break;
				
			}
			
		}
		
		if(isPrime)
	System.out.println(number + " is Prime number");
		else
	System.out.println(number + " is not a Prime number");
	}

}
