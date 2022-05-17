package week1.day1;

public class Car {
	
	public void applyBreak() {
		
		System.out.println("applyBreak");
	}
	
	public void applyGear() {
		
		System.out.println("applyGear");
	}
	
	public void switchAc() {
		System.out.println("switchAC");
		
	}
	
	public void applyAcclerate() {
		System.out.println("applyAcclerate");
		
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.applyBreak();
		myCar.applyGear();
		myCar.switchAc();
		myCar.applyAcclerate();
		

	}

	

}
