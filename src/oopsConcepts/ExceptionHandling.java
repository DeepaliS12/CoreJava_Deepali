package oopsConcepts;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 0;
		
		
		
		try {
			
		int result = a/b;
		
		}catch(ArithmeticException e) {
			
			System.out.println("Arithematic Exception Handled");
		}catch(Exception e) {
			System.out.println("Exception Hnadled");
		}finally {
			System.out.println("Try catch block successfully executed");
		}
		
		System.out.println("hi");
		
	}

}
