package day26exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception01 {
	
	/*
	 	1)There are 2 main types of Exceptions;
	 		a)Compile Time Exceptions (Checked Exceptions)
	 		b)Run Time Exceptions (Unchecked Exceptions)
	    2)After try block you can use 1 or more catch blocks
	    3)try block cannot be used alone
	    3)When you use multiple catch block, make the child exception classes first
	*/
	
	/*
	  What is the meaning of "platform independent"?
	  The meaning of platform-independent is that the java compiled code(byte code) can run on all operating systems.
	*/

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		//You may use nested try-catch block
//		try {
//			fis = new FileInputStream("/Users/apple/Downloads/eclipse-workspace/winterjava/src/day25overridingexceptions/fileForExc.txt");
//			
//			int k = 0;
//			
//			try {
//				while((k = fis.read()) != -1) {
//					
//					System.out.print((char)k);
//					
//				}
//			} catch (IOException e) {
//				System.out.println("File could not be read");
//			}
//	
//		} catch (FileNotFoundException e) {
//			System.out.println("File is deleted or path is wrong");
//		}
		
		//Without using nested try-catch
		try {
			fis = new FileInputStream("/Users/apple/Downloads/eclipse-workspace/winterjava/src/dayoverridingexceptions/fileForExc.txt");
			
			int k = 0;
		
			while((k = fis.read()) != -1) {
				
				System.out.print((char)k);
				
			}
	
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
			System.out.println("File is deleted or path is wrong" + e.getMessage());
			
		} catch(IOException e) {
			
			System.out.println("File could not be read");
			
		}


	}

}
