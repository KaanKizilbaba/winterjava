package day28exceptions;

public class Runner {
	
public static void main(String[] args) {
		
		Laptop b = new Laptop();
		
		b.setB(new BatteryA());//BatteryA is injected
		b.use();
		b.setPrice(30);//Price can be set
		b.turnOnLaptop();
		
		b.setB(new BatteryB());//BatteryB is injected
		b.use();
		b.setPrice(40);//Price can be set
		b.turnOnLaptop();

	}

}
