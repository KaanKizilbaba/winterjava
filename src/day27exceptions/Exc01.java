package day27exceptions;

public class Exc01 {

	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.length());//0
		
		String s2 = null;
		//System.out.println(s2.length());//NullPointerException: If you try to do un appropriate actions with a "null" object
		                                  //                      you will get "NullPointerException"
		                                  //NullPointerException is a "Run Time Exception"
		
		int arr[] = {2, 5, 1, 9};
		//System.out.println(arr[4]);//ArrayIndexOutOfBoundsException: For non-existing indexes in arrays, 
		                           //                                you will get ArrayIndexOutOfBoundsException
		                           //ArrayIndexOutOfBoundsException is a "Run Time Exception"
		
		Object i = 70;
		
		//String s = (String)i;//ClassCastException: If a data type cannot be cast to another data type you will get 
		                       //                    ClassCastException
							   //ClassCastException is a "Run Time Exception"
		
		int a = Integer.parseInt("123");//parseInt() method in Integer wrapper class converts Strings to integer
		System.out.println(a + 2);//125
		
		int b = Integer.parseInt("abc");//NumberFormatException: If you want to convert non-digit Strings to Integer
		                                //                       you will get NumberFormatException
										//NumberFormatException is a "Run Time Exception"
		System.out.println(b + 2);
		

	}

}
