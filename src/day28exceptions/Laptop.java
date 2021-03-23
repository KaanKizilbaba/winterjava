package day28exceptions;

public class Laptop {
	
	private Battery b;
	private int price;

	public Battery getB() {
		return b;
	}
	public void setB(Battery b) {
		this.b = b;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void use() {
		b.use();
	}
	public void turnOnLaptop() {
		System.out.println("Laptop is turned on...");
	}
	
}

interface Battery{
	public void use(); 
}

class BatteryA implements Battery {
	
	   public int price;
	   @Override
	   public void use() {
	      System.out.println("BatteryA is used");
	   }
	   
}

class BatteryB implements Battery  {
	
	   public int price;
	   @Override
	   public void use() {
	      System.out.println("BatteryB is used");
	   }
	   
}
