package day25overridingexceptions;

public class Dog extends Animal{
	
	public boolean tail;
	public int birthYear;
	
	public void bark() {
		System.out.println("Dogs bark");
	}
	
	public void drink() {
		System.out.println("Dogs drink");
	}

}
