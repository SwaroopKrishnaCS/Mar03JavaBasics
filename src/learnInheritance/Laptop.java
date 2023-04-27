package learnInheritance;

public class Laptop {
	
	public int ram;
	public int storageCapacity;
	public String processor;
		
	Laptop(){
		//System.out.println("This is Laptop Class");
	}
	
	Laptop(int ramLaptop){
		this.ram=ramLaptop;
	}
	
	public void keyboard() {
		System.out.println("Laptops should have qwerty keyboard");
	}

}
