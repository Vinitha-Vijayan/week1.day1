package week1.day1;

public class TwoWheeler {
	// Declare variables of TwoWheeler 
	public void myBike() {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 7840442255l;
	boolean isPunctured = false;
	String bikeName = "Activa";
	double runningKM = 348393;
	
	
	System.out.println(noOfWheels);
	System.out.println(noOfMirrors);
	System.out.println(chassisNumber);
	System.out.println(isPunctured);
	System.out.println(bikeName);
	System.out.println(runningKM);
	
	}
	public static void main(String[] args) {
		
		//Create object for the class
		
		TwoWheeler myActiva =new TwoWheeler ();
		myActiva.myBike();
		
		

	}

}
