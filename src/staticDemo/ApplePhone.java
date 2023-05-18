package staticDemo;

public class ApplePhone {
	
	public static String operatingSytem;
	public String memory;
	public int ram;
	
	public ApplePhone(String memory, int ram) {
		super();
		this.memory = memory;
		this.ram = ram;
	}

	public void setOperatingSytem(String operatingSytem1) {
		operatingSytem = operatingSytem1;
	}

	public String getOperatingSytem() {
		return operatingSytem;
	}
	
	

}
