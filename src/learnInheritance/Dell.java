package learnInheritance;

public class Dell extends Laptop {

	public boolean isKeyPadAvailable;

	public Dell() {
		super();
		System.out.println("This is Dell Class");
	}

	public Dell(boolean isKeyPadAvailableInConstr,int ramSize) {
		super(ramSize);
		this.isKeyPadAvailable = isKeyPadAvailableInConstr;
	}

	public Dell(int ramSize) {
		super(ramSize);
	}

	public void displayRam() {
		double screenSize;
		ram += 16;
//		screenSize+=12.5;
	}

}
