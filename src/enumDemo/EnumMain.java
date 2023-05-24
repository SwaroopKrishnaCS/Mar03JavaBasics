package enumDemo;

import java.util.Scanner;

public class EnumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		USStates currentState = USStates.ARIZONA;
		
		System.out.println(currentState.isTaxApplicable());
		
		System.out.println(currentState.getNameOfState());
		System.out.println(currentState.getTax());

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which state do you belong to");
		
		String enteredStateName = sc.next();
		
		USStates enteredState = USStates.getStateByName(enteredStateName);
		
		System.out.println("Sales Tax Applicable: "+enteredState.isTaxApplicable());
		
		System.out.println("Enter your subscription amount");
		
		double subsAmount = sc.nextDouble();
		
		System.out.println("Final Price for the subscription is:"+USStates.calculateTax(enteredState, subsAmount));
		
	}

}
