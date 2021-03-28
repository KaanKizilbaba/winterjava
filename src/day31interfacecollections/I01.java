package day31interfacecollections;


	/*
	 	1)If it is not must, do not use same names
	 	  for variables in parent interfaces
	 	2)If you need to use same names for variables in 
	 	  parent interfaces, when you call variables
	 	  do not forget to use "interface names" otherwise
	 	  you will get Compile Time Error
	 */
public interface I01 {
	int v1 = 2000;
	String name1 = "Audi";
}

interface I02 {
	int v1 = 3000;
	String name2 = "Honda";
}

class Car implements I01, I02{
	
	public static void main(String[] args) {
		
		System.out.println(name1);//Audi
		System.out.println(name2);//Honda
		
		System.out.println(I01.v1);//2000
		System.out.println(I02.v1);//3000
		
	}
	
}
