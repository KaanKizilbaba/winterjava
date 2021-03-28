package day30interfaces;

/*
 	1)All methods in an interface must be abstract
 		Putting "abstract" keyword or not putting "abstract" keyword are same.
 		
 	2)All methods in an interface must be public
 		Putting "public" keyword or not putting "public" keyword are same.
 		In an interface, if you do not see "access modifier" for a method, 
 		it is public not default 
 		
 	3)In an interface, variables are "public", "static" and "final" as default.
 	  No need to type "public", "static" and "final" for variables.
 	  
 	4)In an interface, we have uncompleted methods(abstract methods) because of that Java does not
 	  let us to create objects by using interaces.
 	  Because of the same reason, we cannot create objects by using abstract classes
 	  Note:interfaces do not have constructors
 	       abstract classes have constructors but the constructors are not used to create objects
 */

public interface Sound {

	//Methods are public and abstract in an interface
	public abstract void sound();
	public void increaseVolume();
	void decreaseVolume();
	
	//Variables in an interface are "public", "static" and "final"
	public static final int LEVEL = 12;
	int PRICE = 23;

}
