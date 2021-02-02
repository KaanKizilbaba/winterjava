package day03wrapperclassconcatenatelogicaloperators;

public class IfStatement01 {
	
	/*
	 	If it rains I will cancel the picnic
	 	If I study hard Java is easy
	*/

	public static void main(String[] args) {
		
		if((3<4) && (5>3)) {
			System.out.println("I am activated 1");
		}
		
		if((3<1) || (5>3)) {
			System.out.println("I am activated 2");
		}
		
	}

}
