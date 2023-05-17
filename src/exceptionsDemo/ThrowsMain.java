package exceptionsDemo;

import java.text.ParseException;

public class ThrowsMain {

	public static void main(String[] args)  {
		ThrowsExample tExample = new ThrowsExample();
		
		try {
			tExample.validatePIN(4567);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
//		tExample.parseString("Swaroop");
		
		try {
			tExample.formatDateTime("Not a date");
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
