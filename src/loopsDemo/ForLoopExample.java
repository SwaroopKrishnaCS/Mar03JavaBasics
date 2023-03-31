package loopsDemo;

import java.util.Scanner;

public class ForLoopExample {

	// PIN should be locked if entered incorrectly 3 times

	int actualPIN = 1234;
	int enteredPIN;
	int withdrawAmount;

	Scanner sc = new Scanner(System.in);

	void checkPinIsCorrect() {
		for (
				int counter = 1; 
				counter <= 3; 
				counter++) 
		{
			System.out.println("Enter the PIN");
			enteredPIN = sc.nextInt();
			if (actualPIN == enteredPIN) {
				System.out.println("Entered PIN is correct");
				System.out.println("Enter the amount to be withdrawn:");
				withdrawAmount = sc.nextInt();
				System.out.println("Cash withdrawn in amount of: "+withdrawAmount);
				break;
			} else {
				System.out.println("Entered PIN is incorrect");
			}
		}
	}

}
