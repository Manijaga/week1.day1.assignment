package week1.day1;



public class PrimeNumbers {

	public static void main(String[] args) {
		int input =13;
		boolean flag = false;
		
		for (int i=0;i<=input;i++) {
		
		int output = i%2;
			if (output==0) {
				System.out.println(i+ " Is not a prime number");
				}
			else
			{
				System.out.println(i+ " Is a prime number");
			}
			
		
						
		}
	}

}
