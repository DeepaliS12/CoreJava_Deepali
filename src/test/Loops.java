package test;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int index = 5;
		
		while(index>0) { //while loop---------------
			
			if(index!= 3)
			{
		
		System.out.println(index);
		
			}
		
		index = index - 1;    //can use index-- [decremental operator]
		
		}
		
		int index1 = 5;
		
		while(index1>0) {
		
			System.out.println(index1);
			
			if(index1==3)
			{
				break;
		}
		
		index1--;
		
		}
		

		//do while loop------------
		
		int index3 = 1;
		do {
			System.out.println(index3);
			index3++;
		}while(index3<11);
		
		//for loop----------------
		
		for(int i=0;i<=11;i++)
		{
		 System.out.println(i);			
		}

		
		int myarray[] = {2,3,4,5,6,7};
		for(int l=0;l<myarray.length;l++)
		{
			System.out.println(myarray[l]);
		}
			
		}
	}




