package twoDArrays;

public class OddOrEven {
	
	public boolean isEven(int enteredNum) {
//		if(enteredNum%2==0) {
//			return true;
//		}
//		return false;
		
		boolean isEven = enteredNum%2==0?true : false;
		return isEven;
	}
	
	public String printEvenOrOdd(int enteredNum) {
		String evenOrOdd = isEven(enteredNum)?"Entered Number is Even":
			"Entered Number is Odd";
		return evenOrOdd;
	}

}
