package firstPackage;

public class MobileMain {

	public static void main(String[] args) {
		MobilePhone iPhone = new MobilePhone();
		iPhone.brandName = "IPhone";
		iPhone.modelNumber = 13;
		iPhone.operatingSystem = "iOS";
		iPhone.ram = 16;
		iPhone.isCameraPresent = true;
		iPhone.storageCapacity = 128;
		iPhone.makeCall();
		iPhone.sendText();
		iPhone.takePhoto();
		System.out.println("***************Aleena**********************************");
		MobilePhone samsung = new MobilePhone();
		samsung.brandName = "Samsung";
		samsung.modelNumber = 21;
		samsung.operatingSystem = "Android";
		samsung.ram = 16;
		samsung.isCameraPresent = true;
		samsung.storageCapacity = 256;
		samsung.makeCall();
		samsung.sendText();
		samsung.takePhoto();
	}

}
