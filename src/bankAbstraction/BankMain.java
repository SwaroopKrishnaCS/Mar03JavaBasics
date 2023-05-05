package bankAbstraction;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which bank you want to apply credit card");
		String bankRequested = sc.next();
		BankOfCanada boc = null;
		switch (bankRequested) {
		case "RBC":
			boc = new RBC();
//			RBC rbc = new RBC();
			break;
		case "CIBC":
			boc = new CIBC();
			break;
		default:
			System.out.println("No such bank available");
			break;
		}
		
		boc.provideCreditCard();


	}

}
