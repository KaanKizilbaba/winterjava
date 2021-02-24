package day16multidimensionalarrays;

public class MultiDimArrays03 {

	public static void main(String[] args) {
		
		int arr[][] = { {3, 4}, {5}, {6, 7, 9}, {11, 21} };
		//By using arr array, find the sum of all elements
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sum = sum + arr[i][j];
			}	
		}
		System.out.println(sum);

	}

}
