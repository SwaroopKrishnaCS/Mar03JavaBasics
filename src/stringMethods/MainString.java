package stringMethods;

public class MainString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringDemo stringDemo = new StringDemo();
		
		stringDemo.name = "Jude Tacwel";
//		
//		stringDemo.doesStringContainGivenChar("wel");
		
		int count = stringDemo.countNumberOfOccurancesOfChar('e');
		
		System.out.println(count);
		
		String lastName = stringDemo.getLastName(5);
		System.out.println(lastName);
	}

}
