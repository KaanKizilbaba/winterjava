package day25overridingexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception02 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		//Unhandled exception type FileNotFoundException
		
		try {
			
			fis = new FileInputStream("/Users/apple/Downloads/eclipse-workspace/winterjava/src/day25overridingexceptions/fileForExc.txt");
			
		}catch(FileNotFoundException e) {
			
			System.out.println("The file is deleted or the path is wrong");
			
		}

	}

}
