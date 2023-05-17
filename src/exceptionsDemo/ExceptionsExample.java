package exceptionsDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsExample {

	public static void main(String[] args) {
		BufferedReader bReader;
		try {
			bReader = new BufferedReader(new FileReader("src/exceptionsDemo/user.txt"));
			Integer.parseInt("10");
			DateFormat date = new SimpleDateFormat("MMddyyyy");
			date.parse("This is not a date");
		} catch (FileNotFoundException |ParseException|NumberFormatException e) {
			System.out.println("File not found");
		} 
//		catch (ParseException e) {
//			System.out.println("Not the correct format specified");
//		} catch (NumberFormatException e) {
//			System.out.println("Trying to parse a string value which is not an int");
//		}
	}

}
