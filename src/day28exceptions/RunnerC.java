package day28exceptions;

public class RunnerC {

	public static void main(String[] args) {
		
		LaptopC ld = new LaptopC(new BatteryD());//BatteryD is injected
		ld.use();
		
		LaptopC le = new LaptopC(new BatteryE());//BatteryE is injected
		le.use();
		
	}
	
}
