package day25overridingexceptions;

public class Test extends Derived {

	public static void main(String[] args) {
		Derived obj = new Test();
		obj.getDetails();//getDetails() is coming from Derived Class 
		                 //If you use same method in parent and child classes 
		                 //Java executes "overriding method"....
	}
	
	public void getDetails(){
		System.out.println("Test class");
	}
}
