package conditionalStatements;

import java.util.Scanner;

public class CustomerAccount {

	double accountBalance;
	double overDraftAmount;
	int withdrawAmount;
	boolean isPINCorrect;
	Scanner sc = new Scanner(System.in);

	// If customer has enough balance accountBalance>withdrawAmount
	// If customer has overdraft
	// Either Customer should have accountBalance (OR) customer should have
	// overDraftAmount "||"
	void customerAtmWithdrawal() {

		if (accountBalance > withdrawAmount || overDraftAmount > withdrawAmount) {
			System.out.println("Customer can take cash");
		} else {
			System.out.println("Not enough Balance");
		}
	}

	// Customer should be able to withdraw money if he has balance AND if he enters
	// "&&"
	// the PIN correctly

	void customerAtmWithdrawalWithPIN() {
		
		if (isPINCorrect && accountBalance > withdrawAmount) {
			System.out.println("Customer can take cash");
		} else {
			System.out.println("Cannot take out cash");
		}
	}

}
