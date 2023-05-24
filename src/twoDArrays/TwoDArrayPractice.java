package twoDArrays;

public class TwoDArrayPractice {

	String[] nameList = { "Swaroop", "Ketaki" };

	String[][] useridPassword = { { "swaroop@gmail.com", "abcd1234" }, {"ketaki@email.com", "defg4567" },
			{"neelam@yahoo.com", "qwer7890" }};
	
	
	String [][] personalDetails = {{ "swaroop@gmail.com", "abcd1234","123456790","QueenSt" },
			{"ketaki@email.com", "defg4567","4567890123","Main St"}};
				
			
	public String getPasswordForEnteredUsername(String enteredUsername) {
		String passwordforUserName="";
		for(int i=0;i<useridPassword.length;i++) {
//			if(useridPassword[i][0].equals(enteredUsername)) {
//				return useridPassword[i][1];
//			}
			passwordforUserName = useridPassword[i][0].equals(enteredUsername)?useridPassword[i][1]:null;
		}
		
		return passwordforUserName;
		
		
	}
	
	public boolean validatePassword(String enteredPassword) {
		for (int i=0;i<useridPassword.length;i++) {
			if(useridPassword[i][1].equals(enteredPassword)) {
				return true;
			}
		}
		return false;
		
	}

}
