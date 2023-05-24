package staticDemo;

public class ApplePhone {

	public static String operatingSytem;
	public String memory;
	public int ram;
	public double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ApplePhone(String memory, int ram, double price) {
		super();
		this.memory = memory;
		this.ram = ram;
		this.price = price;
	}

	public void setOperatingSytem(String operatingSytem1) {
		operatingSytem = operatingSytem1;
	}

	public String getOperatingSytem() {
		return operatingSytem;
	}

	public static double calculateDiscount() {
		double discoutPerc = generateRandomNumber();
		return discoutPerc / 100;
	}

	public static double generateRandomNumber() {
		return Math.random() * 10;
	}

	public static double generateRandomNumber(int num1) {
		return Math.random() * num1;
	}

}
