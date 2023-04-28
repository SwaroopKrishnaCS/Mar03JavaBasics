package mortgageBLenders;

import inheritancePractice.BankOfCanada;

public class BLenderBank extends BankOfCanada{
	
	@Override
	public double getInterestRate() {
		interestRate+=12;
		return super.getInterestRate();
	}

}
