package day23encapsulationinheritance;

public class Runner {

	public static void main(String[] args) {
		
	Dog dog1 = new Dog();
	
		dog1.bark();
		dog1.drink();//dog1 inherited drink() from Animal Class
		dog1.eat();//dog1 inherited eat() from Animal Class
		dog1.giveBirth();//dog1 inherited giveBirth() from Mammal Class    

	}

}
