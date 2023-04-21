package constructorDemo;

public class AccountDetailsMain {

	public static void main(String[] args) {
		AccountDetails gopeshAccount = new AccountDetails();
		System.out.println(gopeshAccount.actualBalance);
		System.out.println(gopeshAccount.actualPIN);
		
		AccountDetails account = new AccountDetails();
		
		account.actualBalance = 1000;
		
	}
}
