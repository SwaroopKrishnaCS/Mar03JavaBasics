package bankAbstraction;

public class RBC extends BankOfCanada{
	
	@Override
	public void provideCreditCard() {
		System.out.println("RBC will have credit check");
		System.out.println("Bank asks for employment details");
		System.out.println("Max credit limit allowed = 3000");
	}

}
