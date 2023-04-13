package methodsPractice;

public class ATMWithdrawalWithPin {
	
	int actualPin = 1234;
	double accountBalance = 4567.54;
	
	
	void amountWithdrawal(int withdrawalAmount) {
		if (accountBalance > withdrawalAmount) {
			System.out.println("Customer can withdraw the amount");
		} else {
			System.out.println("Not enough Balance");
		}

	}
	
	boolean validatePIN(int enteredPIN) {
		boolean isPinCorrect = false;
		for(int i=0;i<3;i++) {
			if(enteredPIN==actualPin) {
				isPinCorrect = true;
			}
		}
			return isPinCorrect;
	}

}
