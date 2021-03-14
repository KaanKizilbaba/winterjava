package day22stringbuilderencapsulation;

public class Encapsulation02 {

	public static void main(String[] args) {
		
		Encapsulation01 obj1 = new Encapsulation01();
		
		System.out.println(obj1.getSsn().equals("1234"));//false
		
		obj1.setSsn("1234");
		
		System.out.println(obj1.getSsn().equals("1234"));//true

	}

}
