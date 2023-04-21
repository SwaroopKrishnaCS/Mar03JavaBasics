package fbPackage2;

import accessModifiersDemo.FBAccessModifierDemo;

public class FBAccount {
	
	FBAccessModifierDemo fbAccount1 = new FBAccessModifierDemo();
	
	public void sendFriendRequestFromAnotherAccount() {
		fbAccount1.sendFriendRequest();
	}
	
	public void seePosts() {
//		fbAccount1.sharePost();
	}

}
