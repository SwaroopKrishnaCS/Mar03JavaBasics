package hashMapPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AdvancedForLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nameList = new ArrayList<String>(Arrays.asList("Sucharita", "Nisha","Gopesh","Aleena"));
		
		for (int i=0;i<nameList.size();i++) {
			if(nameList.get(i).equals("Nisha")) {
				System.out.println("Nisha is present in the list");
			}
		}
		
		for(String name: nameList) {
			if(name.equals("Nisha")) {
				System.out.println("Nisha is present in the list");
			}
		}

	}

}
