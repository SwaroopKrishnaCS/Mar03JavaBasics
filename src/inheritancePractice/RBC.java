package inheritancePractice;

public class RBC extends BankOfCanada{
	
	public double primeRateRbc = 2.3;
	
	@Override
	public double getInterestRate() {
		interestRate+=primeRateRbc;
		return interestRate;
	}
	
	public void providePointsCard() {
		System.out.println("RBC Debit card provides Air Miles");
	}
	

}
