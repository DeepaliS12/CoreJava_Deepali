package test;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowsExample obj = new ThrowsExample();
		
		try {
			
		obj.eligibility(90);
		
		}catch(ArithmeticException e)
		
		{
			
			System.out.println("Exception Handled");
		
	    }
	}
		
		public static  void eligibility(int age) throws ArithmeticException{
		
			if(age<18) {
				
		   throw new ArithmeticException("Exception Handled");
				
		}else {
			
			
			System.out.println("Eligible for voting");
		
		}
		}
	

}
