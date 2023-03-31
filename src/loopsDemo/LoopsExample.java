package loopsDemo;

public class LoopsExample {

	// Print 10 successive numbers

	int number;
	int finalNumber = number + 9;

	// while loop

	void print10SuccessiveNumbers() {
		while (number <= finalNumber) {
			System.out.println(number);
			number += 1; // number = number+1
		}
	}
}
