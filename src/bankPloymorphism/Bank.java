package bankPloymorphism;

public class Bank {

	public void withDrawMoney(String chequeNo) {
		System.out.println("Money withdrawn via cheque");
	}
	
	public void withDrawMoney(int pinNumber) {
		System.out.println("Money withdrawn through ATM");
	}
}
