package day21accessmodifiersstringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Java");
		StringBuilder sb2 = new StringBuilder("Java");
		StringBuilder sb3 = new StringBuilder("Hava");
		StringBuilder sb4 = new StringBuilder("Mava");
		
		//How to compare two StringBuilders
		
		//1. Way
		System.out.println(sb1.equals(sb2));//false because it returns sb1==sb2
		
		//2. Way
		/*
		 	a)Returns 0 if StringBuilders have the same character sequence
		 	b)Returns negative numbers if sb1 is before the sb2 in alphabetical order
		 	c)Returns positive numbers if sb1 is after the sb2 in alphabetical order
		 */
		System.out.println(sb1.compareTo(sb2));//0
		System.out.println(sb3.compareTo(sb2));//-2 ==> H - I - J
		System.out.println(sb4.compareTo(sb2));//3 ==> J - K - L - M
		
		//3. Way
		System.out.println(sb1.toString().equals(sb2.toString()));//true
		System.out.println(sb3.toString().equals(sb2.toString()));//false
		
		
	}

}
