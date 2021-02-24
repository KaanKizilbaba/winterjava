package day16multidimensionalarrays;

import java.util.Arrays;

public class MultiDimArrays01 {

	public static void main(String[] args) {
		
		int arr[][] = { {7, 11, 5}, {71, 12}, {9} };
		
		
		//How to print a specific element
		System.out.println(arr[0][0]);//7
		System.out.println(arr[0][1]);//11
		System.out.println(arr[1][1]);//12
		
		//How to update "5" to 88
		arr[0][2] = 88;
		arr[2][0] = 19;
		
		//To print multidimensional arrays on the console, use deepToString() method
		System.out.println(Arrays.deepToString(arr));
		
		//How to print first array and last array
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[2]));
		
		//How to find the sum of the elements of the first array 
		//[[7, 11, 88], [71, 12], [19]]
		
		int sum = 0;
		
		for(int i=0; i<arr[0].length; i++) {
			
			sum = sum + arr[0][i];
		}
		
		System.out.println(sum);

	}

}
