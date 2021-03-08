package day20passbyvaluepassbyreferencedate;

public class Test1 {

	public static void main(String[] args) {
		
		String a = "";
		
		a = a + 2;
		
		a = a + 'c';
		
		a = a + false;
		
		System.out.println(a);//2cfalse
		
		System.out.println(a=="2cfalse");//false
		
		
		
		
		
		
		System.out.println(a.equals("2cfalse"));

	}

}
