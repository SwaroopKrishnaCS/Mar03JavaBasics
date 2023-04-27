package learnInheritance;

public class LaptopMain {

	public static void main(String[] args) {
		
		Dell dell = new Dell(true,8);
//		dell.ram = 8;
		
		Dell dell4010 = new Dell(8);
		
		Dell dell44560 = new Dell(16);
		
		dell.keyboard();
		
		Laptop laptop = new Laptop();
		
		
				
	}

}
