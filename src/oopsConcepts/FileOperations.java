package oopsConcepts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperations {
	
	public static void main(String[] args)

	{	
	FileOutputStream fileOutputStream;	
	try {
	
		fileOutputStream	= new FileOutputStream("abc.txt");

	String msg ="Welcome to Java";
	
	byte byteArray[] = msg.getBytes();
	
	fileOutputStream.write(byteArray);
	
	System.out.println("Message written to file successfully");
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
	
	
			}	

}
