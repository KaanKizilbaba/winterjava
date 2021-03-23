package day16multidimensionalarrays;

public class MultiDimArrays02 {

	public static void main(String[] args) {
		
		int brr[][] = { {32, 12, 11}, {21, 34}, {3} };
		//By using brr array, find the multiplication of the first elements in every array
				
		int prod = 1;
		
		for(int i=0; i<brr.length; i++) {
			prod = prod * brr[i][0];
		}
		
		System.out.println(prod);
				
	
		String arr[][] = { {"Laptop", "Y", "M", "Laptop"}, {"K", "e"}, {"L", "X", "e"} };
		//By using arr array, concatenate the last elements in every array
		
		String s = "";
		
		for(int i=0; i<arr.length; i++) {	
				s = s + arr[i][arr[i].length - 1];
		}
		
		System.out.println(s);

	}

}
