package week1.day1;

public class TwoWheeler {

	
		int noOfWheels = 4;
		short noOfMirors = 2;
		long cassisNumber = 234567899;
		boolean isPunctured = true ;
		String bikeName = "Hero";
		double runningKM = 55.5;
		
	public static void main(String[] args) {
		
		TwoWheeler myTwoWheeler = new TwoWheeler();		
		System.out.println("Number of Wheels = "+ myTwoWheeler.noOfWheels);
		System.out.println("Number of Mirors = "+ myTwoWheeler.noOfMirors);
		System.out.println("Care Cassis Number = "+ myTwoWheeler.cassisNumber);
		System.out.println("Is this Care Punctured = "+ myTwoWheeler.isPunctured);
		System.out.println("Bike Name = "+ myTwoWheeler.bikeName);
		System.out.println("Running KM = "+ myTwoWheeler.runningKM);		
				

	}

}
