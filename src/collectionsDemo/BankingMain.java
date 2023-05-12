package collectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BankingMain {

	public static void main(String[] args) {

		PersonalDetails swaroopAccount = new PersonalDetails("Swaroop", "123456789", 4567);
		PersonalDetails manvirAcct = new PersonalDetails("Manvir", "4567890123", 1234);
		PersonalDetails ketakiAcct = new PersonalDetails("Ketaki", "7890123456", 7890);

//		PersonalDetails[] personDetailsList = new PersonalDetails[3];
		PersonalDetails[] personDetailsList = { swaroopAccount, manvirAcct, ketakiAcct };

		// Declare an arraylist
		ArrayList<PersonalDetails> acctList = new ArrayList<PersonalDetails>();

		// Populate an arrayList or add elements into an ArrayList
		acctList.add(swaroopAccount);
		acctList.add(manvirAcct);
		acctList.add(ketakiAcct);

		PersonalDetails cleminAcct = new PersonalDetails("Clemin", "7890456123", 3214);
		acctList.add(cleminAcct);

		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Please enter your name");
//		String nameEntered = sc.next();
//		BankOperation bankOperation = new BankOperation();
//		
//		for(int i=0;i<acctList.size();i++) {
//			if(nameEntered.equals(acctList.get(i).getNameOfCustomer())){
//				System.out.println("Enter your PIN");
//				int enteredPin = sc.nextInt();
//				bankOperation.validatePin(acctList.get(i), enteredPin);
//			}
////			else {
////				System.out.println("Incorrect account Number");
////			}
//		}

		List<String> nameList = new ArrayList<String>();
		nameList.add("Gopesh");
		nameList.add("Sucharita");
		nameList.add("Neelam");
		nameList.add("ManpreetS");
		System.out.println(nameList.toString());

//		nameList.remove(0);

		System.out.println("Enter the name you want to remove");
//		Replace an element in arraylist
		String enteredName = sc.next();
		for (int i = 0; i < nameList.size(); i++) {
			if (enteredName.equals(nameList.get(i))) {
				nameList.remove(i);
			}
		}
		System.out.println(nameList.toString());
		var nameArray = nameList.toArray();
		System.out.println(nameArray.length);
		System.out.println(Arrays.toString(nameArray));
	}
	
	List<Integer> numberList = new ArrayList<Integer>();

}
