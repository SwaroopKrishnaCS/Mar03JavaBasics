package inheritancePractice;

public class CIBC extends BankOfCanada{
	
	@Override
	public double getInterestRate() {
		interestRate+=2.7;
		return interestRate;
	}

}
