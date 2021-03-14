package day24inheritanceoverriding;

public class Dog extends Mammal {
	
	public boolean smellWell;
	
	public int height = 25;

	
	public Dog() {
		super();//If you type "super()" it is fine, 
		        //if you do not type Java puts it automatically
		System.out.println("Dog constructor without parameter...");
	}
	
	public Dog(boolean smellWell) {
		super(true);
		//If you do not type any parent constrcutor call inside the first line
		//Java uses the parent constructor without parameter automatically
		
		/*
		 	"super()" is for "parent constructors call"
		 	"super" is for "parent variables call"
		*/
		
//		super.haveBaby = true;
//		super.height=11;
//		super.weight=22;
		
		//super.height; ==> returns the height value from parent classes (Animal)
		//this.height; ==> return the height value from the class itself (Dog)
		
		//If you have multiple varibles whose names are same in different parent classes
		//super keyword selects the closest one
		
		this.smellWell = smellWell;
		
	}

}
