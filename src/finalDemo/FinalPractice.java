package finalDemo;

public class FinalPractice {
	
	private static final double pi = 3.14;

//	public FinalPractice(double piValue) {
//		super();
//		pi = piValue;
//	}

	public final double getPi() {
		return pi;
	}
	
	public final double getPi(int num) {
		return pi+2;
	}

//	public void setPi(double pi) {
//		this.pi = pi;
//	}
	
	

}
