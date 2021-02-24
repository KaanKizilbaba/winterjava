package day15arrays;

import java.util.Arrays;

public class Arrays02 {
	
	/*
	 	int a[] = {5, 2, 6};
	 	int b[] = {5, 2, 6};
	 	int c[] = {5, 6, 2};
	 	1) Check if array "a" equals to array "b"
	 	1) Check if array "b" equals to array "c"
	 */

	public static void main(String[] args) {
		/*
		 	If two arrays are equal to each other, same elements must be in same indexes.
		*/
		int a[] = {5, 2, 6};
	 	int b[] = {5, 2, 6, 8};
	 	int c[] = {5, 6, 2};
	 	
	 	//1.Way: Used flag....
	 	int count = 0;
	 	int length = 0;
	 	
	 	if(a.length<b.length) {
	 		length = a.length;
	 	}else {
	 		length = b.length;
	 	}
	 	 	
	 	for(int i=0; i<length; i++) {
	 		if(a[i] != b[i]) {
	 			count++;
	 		}
	 	}

	 	if(a.length!=b.length) {
	 		System.out.println("Arrays are not equal");
	 	}else if(count!=0) {
			System.out.println("Arrays are not equal");
		}else {
			System.out.println("Arrays are equal");
		}
	 	
	 	//2.Way: Use method from Arrays class..
	 	int d[] = {2, 9, 3, 4};
	 	int e[] = {2, 9, 3};
	 	
	 	System.out.println(Arrays.equals(d, e));//false

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
