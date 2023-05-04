package compositionDemo;

public class Dealership {

	public String dealershipName;

	private Car[] carList = new Car[5];

	String[] nameList = new String[5];

//	public void addCarToDealership(Car carBroughtToDelership) {
//		car = carBroughtToDelership;
//	}
//	
//	public void getCarName() {
//		System.out.println(car.getBrandName());
//	}

	public void addCarsToDealership(Car carBroughtToDelership) {
		for (int i = 0; i < carList.length; i++) {
			if (carList[i] == null) {
				carList[i] = carBroughtToDelership;
				break;
			}
		}
	}

	public double getRequestedCarPrice(String carRequested) {
		double priceOfRequestedCar = 0;
		for (int i = 0; i < carList.length; i++) {
			if (carList[i].getBrandName().equals(carRequested)) {
				priceOfRequestedCar = carList[i].getPriceOfCar();
				break;
			}
		}
		return priceOfRequestedCar;

	}

}
