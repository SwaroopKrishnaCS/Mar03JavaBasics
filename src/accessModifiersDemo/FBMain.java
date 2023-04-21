package accessModifiersDemo;

public class FBMain {

	public static void main(String[] args) {

		FBAccessModifierDemo fbAccount = new FBAccessModifierDemo();
		
		System.out.println(fbAccount.nameOnAccount);
		
		System.out.println(fbAccount.posts);
			
		fbAccount.sendFriendRequest();
		
		fbAccount.sharePost();
		
	}

}
