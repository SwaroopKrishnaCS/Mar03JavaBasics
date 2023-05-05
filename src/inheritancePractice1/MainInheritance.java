package inheritancePractice1;

public class MainInheritance {

	public static void main(String[] args) {
		
		A a = new C();
		
		C cb = (C) new B();
		
		C c = (C) new A();

	}

}
