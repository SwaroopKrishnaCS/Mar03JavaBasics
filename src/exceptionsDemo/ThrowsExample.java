package exceptionsDemo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ThrowsExample {
	
	int pin = 1234;
	
	public void validatePIN(int enteredPin) throws Exception {
		if(pin==enteredPin) {
			System.out.println("Pin is correct");
		}else {
			throw new Exception("Incorrect PIN");
		}
	}
	
	public void parseString(String intToBeParsed) throws NumberFormatException{
		Integer.parseInt(intToBeParsed);
	}
	
	public void formatDateTime(String dateTimeFormat) throws ParseException {
		DateFormat date = new SimpleDateFormat("MMddyyyy");
		date.parse(dateTimeFormat);
	}
	
	public void formatDateTimeNew(String dateTimeFormat) {
		DateFormat date = new SimpleDateFormat("MMddyyyy");
		try {
			date.parse(dateTimeFormat);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
