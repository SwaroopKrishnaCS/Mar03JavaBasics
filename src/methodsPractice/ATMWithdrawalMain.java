package methodsPractice;

public class ATMWithdrawalMain {

	public static void main(String[] args) {

		ATMWithdrawalWithPin swaroopAccount = new ATMWithdrawalWithPin();
		
		boolean isPINCorrect = swaroopAccount.validatePIN(1234);
		
		if(isPINCorrect) {
			swaroopAccount.amountWithdrawal(1000);
		}else {
			System.out.println("Pin is incorrect");
		}
//		System.out.println("Entered PIN is correct: "+isPINCorrect);
		
		
	}

}
