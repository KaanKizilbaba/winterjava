package day21accessmodifiersstringbuilder;

import java.time.LocalTime;

public class StringBuilder03 {

	public static void main(String[] args) {
		
		long startingTimeSb = System.nanoTime();
		StringBuilder sb1 = new StringBuilder();
		for(int i=0; i<1000; i++) {
			sb1.append("abc");
		}
		long endingTimeSb = System.nanoTime();
		
		System.out.println(endingTimeSb - startingTimeSb);
		
		long startingTimeStr = System.nanoTime();
		String sb2 = "";
		for(int i=0; i<1000; i++) {
			sb2 = sb2.concat("abc");
		}
		long endingTimeStr = System.nanoTime();
		
		System.out.println(endingTimeStr - startingTimeStr);


	}

}
