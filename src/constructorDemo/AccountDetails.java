package constructorDemo;

public class AccountDetails {
	
	int actualPIN;
	double actualBalance=4567.54;
	
	//Method like structure
	//Same name as class
	//No return type
	AccountDetails(){
		System.out.println("This is a constructor");
//		System.out.println("Actual Balance is: "+actualBalance);
//		System.out.println("Actual PIN is: "+actualPIN);
		actualPIN = 1234;
		actualBalance = 7890.12;
	}

}
