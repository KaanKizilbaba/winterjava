package day23encapsulationinheritance;

//void is used a)When you print sth on the console b)When you do just an action

public class Encapsulation01 {
	
	private String name = "Ali Can";
	private int age = 21;
	private boolean retired = false;

	private char initial = 'A';
	private String address = "Miami Florida";
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//For getters of boolean variables start the name of getter with "is"
	public boolean isRetired() {
		return retired;
	}
	public void setRetired(boolean retired) {
		this.retired = retired;
	}
	//To make "initial" variable just readable, you should not create "setter", create just "getter"
	public char getInitial() {
		return initial;
	}

	//Make "address" just updatable, you should not create "getter", you should create "setter"
	public void setAddress(String address) {
		this.address = address;
	}
	
	/*
	 	1)If you want not to update any value, do not create any setter method.
	 	  Question:How can you make a class "immutable class"?
	 	  Answer: Make all variables private then do not create any setter method
	 */

}
