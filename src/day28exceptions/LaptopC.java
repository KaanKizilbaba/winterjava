package day28exceptions;

public class LaptopC {
	
	BatteryI b;
	
	public LaptopC(BatteryI b) {
		this.b = b;
	}
	
	public void use() {
	    b.use();
	}

}

interface BatteryI{
	public void use(); 
}

class BatteryD implements BatteryI {

	   @Override
	   public void use() {
	      System.out.println("BatteryD is used");
	   }
	   
}

class BatteryE implements BatteryI  {

	   @Override
	   public void use() {
	      System.out.println("BatteryE is used");
	   }
	   
}
