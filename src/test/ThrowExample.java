package test;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 19;
		
		try {
		
		if(age<18) {
			
		 throw new ArithmeticException("Age is not valid");
		 
		}else
			
			System.out.println("Eligible for voting");

	
	}catch(ArithmeticException e) {
	
		System.out.println("Exception Handled");
	}
	}

}
