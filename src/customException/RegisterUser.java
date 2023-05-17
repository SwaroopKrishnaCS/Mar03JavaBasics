package customException;

import java.util.Arrays;
import java.util.List;

public class RegisterUser {

	List<String> registeredEmails = Arrays.asList("abc@gmail.com", "xyz@gmail.com");

	
	
    public void validateEmail(String email) throws EmailNotUniqueException, InvalidEmailFormatException {
    	
        if (registeredEmails.contains(email)) {
            throw new EmailNotUniqueException("Email Already Registered");
        }
        if(email.matches("(\\S.*\\S)(@)(\\S.*\\S)(.\\S[a-z]{2,3})")) {
        	System.out.println(String.format("Email '%s' is valid!", email));
        }else {
        	throw new InvalidEmailFormatException("Email format is not valid");
        }
        
    }
}
