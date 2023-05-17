package customException;

public class RegisterUserMain {

	public static void main(String[] args) {
		
		RegisterUser registerUser = new RegisterUser();
		
		try {
			registerUser.validateEmail("abc-gmail.com");
		} catch (EmailNotUniqueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidEmailFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
