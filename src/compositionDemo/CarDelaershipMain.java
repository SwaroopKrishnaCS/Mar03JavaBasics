package compositionDemo;

import java.util.Scanner;

public class CarDelaershipMain {

	public static void main(String[] args) {
		
		Car hondaCivic = new Car("Honda", "White", 5, 24000);
		
		Dealership ds = new Dealership();
		
//		ds.addCarToDelaership(hondaCivic);
		
		Car kiaSeltos = new Car("Kia", "Blue", 5, 20000);
		
		Car toyotaCorolla = new Car("Toyota", "Black", 5, 25000);
		
//		ds.addCarToDelaership(kiaSeltos);
		
//		ds.getCarName();
		
		ds.addCarsToDealership(hondaCivic);
		ds.addCarsToDealership(kiaSeltos);
		ds.addCarsToDealership(toyotaCorolla);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Which car would yu like to buy? Honda, Kia or Toyota");
		
		String carRequested = sc.next();
		
		double priceOfRequestedCar = ds.getRequestedCarPrice(carRequested);
		System.out.println("Price for the car: "+priceOfRequestedCar);
		
		sc.close();

	}

}
