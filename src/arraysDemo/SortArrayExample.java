package arraysDemo;

import java.util.Scanner;

public class SortArrayExample {

	int[] rollNumber = new int[5];
	Scanner sc = new Scanner(System.in);
	void populateRollNumber() {
		for(int i = 0; i<rollNumber.length;i++) {
			System.out.println("Enter the roll number");
			rollNumber[i]=sc.nextInt();
		}
	}
	
	void printRollNumbers() {
		System.out.println("Entered Roll Numbers");
		for (int i = 0; i < rollNumber.length; i++) {
			System.out.println(rollNumber[i]);
		}
	}
	
	void sortRollNumbers() {
		int swapNumber=0;
		System.out.println("Sorted Array");
		for(int i=0;i<rollNumber.length;i++) {
			for(int j = i+1;j<rollNumber.length;j++) {
				if(rollNumber[i]>rollNumber[j]) {
					swapNumber = rollNumber[i];
					rollNumber[i] = rollNumber[j];
					rollNumber[j] = swapNumber;
				}
			}
		}
	}
}
