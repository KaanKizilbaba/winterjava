package day31interfacecollections;

public class Operations implements I03{

	public static void main(String[] args) {
		
		//add() method is default method in I03 because of that I cannot access 
		//to add() method by using interface name but multiply() method is static method we can 
		//access to it just by using interface name
		I03.multiply(10, 20);
		
		//add() method is a default method because of that I have to create an object to access to
		//add() method.
		I03 obj = new Operations();
		obj.add(23, 12);
		
		//Note: When we use classes, accessing static methods is allowed by using objects, but 
		//      in interfaces, when you create static methods you can access them just by using interface names.
		//      Accessing by using object is not allowed.

	}

}
