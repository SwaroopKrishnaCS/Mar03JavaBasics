package staticDemo;

public class MobileMain {

	public static void main(String[] args) {
		ApplePhone iphone12 = new ApplePhone("64GB", 6,999.99);
		ApplePhone iphone13 = new ApplePhone("128GB", 8,1099.99);
		ApplePhone iphone14 = new ApplePhone("128GB", 12,1199.99);

		iphone12.setOperatingSytem("IOS");

		System.out.println(iphone12.getOperatingSytem());

		System.out.println(iphone13.getOperatingSytem());

		iphone12.setOperatingSytem("Android");

		System.out.println(iphone12.getOperatingSytem());
		
//		iphone12.calculateDiscount();

		System.out.println(iphone13.getOperatingSytem());
		System.out.println(iphone14.getOperatingSytem());
		
		System.out.println(ApplePhone.operatingSytem);

		ApplePhone.calculateDiscount();
	}

}
