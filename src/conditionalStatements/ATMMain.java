package conditionalStatements;

public class ATMMain {

	public static void main(String[] args) {

		CustomerAccount swaroopAccount = new CustomerAccount();
		
		swaroopAccount.accountBalance = 4000.35;
		swaroopAccount.withdrawAmount = 2000;
		swaroopAccount.customerAtmWithdrawal();
		
	}

}
