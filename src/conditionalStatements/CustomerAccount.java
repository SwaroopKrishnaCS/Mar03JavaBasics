package conditionalStatements;

public class CustomerAccount {

	double accountBalance;
	double overDraftAmount;
	int withdrawAmount;

	// If customer has enough balance accountBalance>withdrawAmount
	// If customer has overdraft
	void customerAtmWithdrawal() {
		if (accountBalance > withdrawAmount) 
		{
			System.out.println("Customer can take cash");
		} 
		else 
		{
			System.out.println("Not enough Balance");
		}
	}

}
