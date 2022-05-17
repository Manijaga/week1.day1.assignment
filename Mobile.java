package week1.day1;

public class Mobile {
	
	public void makeCall() {
		System.out.println("Call My Mom");		
	}
	
	public void sendMsg() {
		System.out.println("Semd Message to My Mom");
		
	}
	
	public static void main(String[] args) {
		
		Mobile myMobile = new Mobile();
		
		myMobile.makeCall();
		myMobile.sendMsg();
		
	}

}
