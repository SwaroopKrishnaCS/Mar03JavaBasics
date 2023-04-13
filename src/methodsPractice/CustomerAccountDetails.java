package methodsPractice;

public class CustomerAccountDetails {

	double accountBalace = 5004.35;
	int withdrawalAmount;
	
	void amountWithdrawal(int withdrawalAmount) {
		if (accountBalace > withdrawalAmount) {
			System.out.println("Customer can withdraw the amount");
		} else {
			System.out.println("Not enough Balance");
		}

	}

	void printAccountName(String nameOfCustomer) {
		System.out.println("Name of the customer: " + nameOfCustomer);
	}

	void withdrawAmountFromATM(int withdrawalAmount, String nameOfCustomer) {
		System.out.println("Name of the customer: " + nameOfCustomer);
		if (accountBalace > withdrawalAmount) {
			System.out.println("Customer can withdraw the amount");
		} else {
			System.out.println("Not enough Balance");
		}
	}

}
