package bankDetailsWithOOPS;

public class AccountDetails {

	String accountNumber;
	private int pinNumber;
	double balance;

	public AccountDetails(String accountNumber, int pinNumber) {
		this.accountNumber = accountNumber;
		this.pinNumber = pinNumber;
	}

//	public int getPinNumber() {
//		return pinNumber;
//	}
//
//	public void setPinNumber(int pinNumber) {
//		this.pinNumber = pinNumber;
//	}
//
//	public double getBalance() {
//		return balance;
//	}
//
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//
//	public String getAccountNumber() {
//		return accountNumber;
//	}

	void withdrawMoney() {
		System.out.println("Money Withdrawn");
	}

	public int getPinNumber(boolean isBank) {
		if (isBank) {
			return pinNumber;
		}
		return 0;
	}

	public void setPIN(int newPIN, int existingPin) {
		if (existingPin == pinNumber) {
			pinNumber = newPIN;
		} else {
			System.out.println("You have entered an invalid PIN");
		}
	}

}
