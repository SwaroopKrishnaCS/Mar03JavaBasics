package inheritancePractice;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

//		RBC rbc = new RBC();
//		double rbcInterestRate = rbc.getInterestRate();
//		System.out.println("Interest Rate for RBC: " + rbcInterestRate);
//
//		CIBC cibc = new CIBC();
//		double cibcInterestRate = cibc.getInterestRate();
//		System.out.println("Interest Rate for CIBC: " + cibcInterestRate);
//
////		BankOfCanada boc = new BankOfCanada();
//
		BankOfCanada boc = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Where do you want to take Loan");
		String selectedBank = sc.next();
		switch (selectedBank) {
		case "CIBC":
			boc = new CIBC();
			break;
		case "RBC":
			boc = new RBC();
			break;

		default:
			break;
		}
		System.out.println("Interest Rate for RBC: " + boc.getInterestRate());

		boc.provideCreditReport();

//		int account = 4567;

	}

}
