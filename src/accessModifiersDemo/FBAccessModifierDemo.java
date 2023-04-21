package accessModifiersDemo;

public class FBAccessModifierDemo {
	
	public String nameOnAccount = "Swaroop";
	
	String posts;
	
	private String password;
	
	public void sendFriendRequest() {
		System.out.println("Friend request sent");
	}
	
	void sharePost() {
		System.out.println("Sharing Post");
	}
	
	
	

}
