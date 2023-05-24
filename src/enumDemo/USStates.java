package enumDemo;

public enum USStates {

	CALIFORNIA("California", true, 14.5), NEWYORK("Newyork", true, 15), ARIZONA("Arizona", false, 0),
	ALASKA("Alaska", false, 0), TEXAS("Texas", true, 12.5), OHIO("Ohio", true, 13.5), ALABAMA("Alabama", true, 14);

	String nameOfState;
	boolean isTaxApplicable;
	double tax;

	private USStates(String nameOfState, boolean isTaxApplicable, double tax) {
		this.nameOfState = nameOfState;
		this.isTaxApplicable = isTaxApplicable;
		this.tax = tax;
	}

	public String getNameOfState() {
		return nameOfState;
	}

	public boolean isTaxApplicable() {
		return isTaxApplicable;
	}

	public double getTax() {
		return tax;
	}

	public static USStates getStateByName(String nameEntered) throws NullPointerException {
		System.out.println(USStates.values());
		for (USStates state : USStates.values()) {
			if (state.getNameOfState().equals(nameEntered)) {
				return state;
			}
		}
		return null;
	}

	public static double calculateTax(USStates selectedState, double subscriptionAmount) {
		if (selectedState.isTaxApplicable()) {
			return (subscriptionAmount) + ((selectedState.getTax() * subscriptionAmount) / 100);
		} else {
			return subscriptionAmount;
		}
	}

}
