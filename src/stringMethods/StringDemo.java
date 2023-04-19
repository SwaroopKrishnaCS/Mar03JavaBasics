package stringMethods;

public class StringDemo {

	String name;
	
	
	void doesStringContainGivenChar(String charToCheck) {
		if(name.contains(charToCheck)) {
			System.out.println(name+" contains "+charToCheck);
		}else {
			System.out.println(name+" does not contain "+charToCheck);
			
		}
	}
	
	//Find number of times a character occur in a String
	int countNumberOfOccurancesOfChar(char charToBeChecked) {
//		char[] nameAsChar = new char[name.length()];
		int counter = 0;
		for(int i=0;i<name.length();i++) {
//			nameAsChar[i]=name.charAt(i);
			if(name.charAt(i)==charToBeChecked) {
				counter++;
			}
		}
		
//		for (int j=0;j<nameAsChar.length;j++) {
//			if(nameAsChar[j]==charToBeChecked) {
//				counter++;
//			}
//		}
		return counter;
	}
	
	String getLastName(int index) {
		String lastName = name.substring(index);
		return lastName;
	}
	
}
