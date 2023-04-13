package methodsPractice;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the amount to withdraw");
		int withdrawalAmount = sc.nextInt();
		CustomerAccountDetails swaroopAccount = new CustomerAccountDetails();
//		swaroopAccount.printAccountName("Swaroop Krishna");
		swaroopAccount.amountWithdrawal(5000);
		withdrawalAmount = 2000;
		swaroopAccount.withdrawAmountFromATM(withdrawalAmount, "Swaroop");

	}

}
