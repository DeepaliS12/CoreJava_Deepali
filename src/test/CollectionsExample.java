package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> myList = new ArrayList();
		myList.add("Raj");
		myList.add("Kiran");
		myList.add("Srikant");
		myList.add("Priya");
		
		System.out.println("before Sorting");
		System.out.println(myList);
		
		Collections.sort(myList);
		 
        System.out.println("after Sorting");
	    System.out.println(myList);
	    
	    Collections.sort(myList,Collections.reverseOrder());
	    
	    System.out.println("reverse Sorting");
	    System.out.println(myList);
	    
	    Stack<String> myStack = new Stack();
	    
	    myStack.push("abc");
	    myStack.push("xyz");
	    myStack.pop();
	    myStack.push("pqr");
	    
	    System.out.println(myStack);
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
   		

	}

}