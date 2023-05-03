package multiLevelInheritance;

public class Dell extends Laptop{
	
	public boolean isTouchScreenAvailable;
	public String operatingSystem;
	
	public void provideWarranty() {
		System.out.println("Dell provides 3 year warranty");
	}
	
	public void provideDrivers() {
		System.out.println("Provide Driver CD");
	}
	
	@Override
	public void loginMethod() {
		// TODO Auto-generated method stub
		System.out.println("Dell provides fingerprint authentication");
	}

}
