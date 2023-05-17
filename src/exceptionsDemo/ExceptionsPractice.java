package exceptionsDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExceptionsPractice {

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<String>(Arrays.asList("Neelam", "Hamneet", "Manpreet", "Jimna"));

		try {
			nameList.get(4);
		} catch (Exception e) {
			System.out.println("Only 4 elemnts present in the list");
//			e.printStackTrace();
		}

		System.out.println(nameList.toString());

		try {
			BufferedReader bReader = new BufferedReader(new FileReader("src/exceptionsDemo/user.txt"));
		} catch (Exception e) {
			if(e instanceof FileNotFoundException) {
				System.out.println("File not found");
			}
		}

		DateFormat date = new SimpleDateFormat("MMddyyyy");
		try {
			date.parse("This is not a date");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		String number = "50";
		int numberInInt = 0;
		// Can a try block exist by its own
		try {
			numberInInt = Integer.parseInt(number);
		} catch (NumberFormatException e) {
			System.out.println("We have exception");
		} finally {
			System.out.println("This is finally block");
		}

		System.out.println(numberInInt);
	}

}
