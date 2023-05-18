package upcastingDowncastingExamples;

import java.util.Scanner;

import javax.naming.InvalidNameException;

public class AnimalMain {

	public static void main(String[] args) throws Exception {

		// Downcasting
		Animal animal = new Lion();

		animal.drink();

//		Lion lion = new Lion();
		Lion lion = (Lion) animal;

		lion.makesSound();

		Mammal mammal = new Mammal();

		mammal.sleep();

//		Lion lion2 = (Lion) mammal;
//		lion2.makesSound();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the animal name");
		String animal1 = sc.next();
		Mammal mammal1 = null;

		try {
			switch (animal1.toLowerCase()) {
			case "lion":
				mammal1 = new Lion();
				break;
			case "tiger":
				mammal1 = new Tiger();
			default:
				throw new InvalidNameException();
			}
			mammal1.drink();
		} catch (InvalidNameException e) {
			System.out.println("Exception: Enter the correct case as Lion or Tiger");
		}
		
		Animal animal2 = null;
		
		lion.eat(animal2);

	}

}
