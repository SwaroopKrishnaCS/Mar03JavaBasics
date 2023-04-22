package bankDetailsWithOOPS;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {

		AccountDetails parminderAccount = new AccountDetails("1234567", 4567);
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the PIn number");
//		int pinEntered = sc.nextInt();
//		if(pinEntered == parminderAccount.getPinNumber()) {
//			parminderAccount.withdrawMoney();
//		}
		parminderAccount.setPIN(4321,7891);
		System.out.println("are you a bank");
		boolean isBank = sc.nextBoolean();
		System.out.println("Current PIN "+parminderAccount.getPinNumber(isBank));
		
		AccountDetails gopeshAccount = new AccountDetails("4567891", 9874);

	}

}
