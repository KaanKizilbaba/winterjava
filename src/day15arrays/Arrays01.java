package day15arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		int num[] = {5, 1, 2};
		System.out.println(Arrays.toString(num));
		
		//How to sort array elements
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		//How to sort array elements in descending order
			//1)You should sort the elements in ascending order
		    //2)By using loops put the elements in descending order		
		int revNum[] = new int[num.length]; 		
		for(int i=0; i<num.length; i++) {
			revNum[i] = num[num.length-1 - i];
		}		
		System.out.println(Arrays.toString(revNum));
		
		//How to check if an element exists or not in an Array...
			//1)Sort the array elements
		    //2)Use binarySearch() method
		//Note:If you use binarySearch() method without sorting elements, 
		//     you will get a result but it will not be meaningful.
		int num2[] = {2, 7, 1, 13};
		
		Arrays.sort(num2);//{1, 2, 7, 13}
		System.out.println(Arrays.binarySearch(num2, 7));//binarySearch() method returns the index
		System.out.println(Arrays.binarySearch(num2, 13));//3
		
		//If an element does not exist in the array, Java returns the "order  number" with negative sign
		System.out.println(Arrays.binarySearch(num2, 4));// -3
		System.out.println(Arrays.binarySearch(num2, 22));// -5
	}

}
