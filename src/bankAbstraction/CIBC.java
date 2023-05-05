package bankAbstraction;

public class CIBC extends BankOfCanada{
	
	@Override
	public void provideCreditCard() {
		System.out.println("CIBC will have credit check");
		System.out.println("Max credit limit allowed = 4000");
	}

}
