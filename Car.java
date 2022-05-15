package week1.day1;

public class Car {
	
	//creating methods (actions) for car
	public void applyBreak() {
		System.out.println("Please apply break");
	}
public void applyGear() {
	System.out.println("Please apply Gear");
}

public void switchonAC() {
	System.out.println("Please switchon the AC");
}
public void applyAcclerate() {
	System.out.println("Please apply acclerator");
}
	public static void main(String[] args) {
	
		Car myCarActions =new Car();
		 
		myCarActions.applyBreak();
		myCarActions.applyGear();
		myCarActions.switchonAC();
		myCarActions.applyAcclerate();
			
	}
	

}
