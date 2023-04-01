package switchCaseExample;

public class SwitchMain {

	public static void main(String[] args) {


		String operation = "square";
		SwitchExample calculator = new SwitchExample();
		calculator.num1 = 10;
		calculator.num2 = 4;

		switch (operation) {
		case "add":
			calculator.sumOfNumbers();
			break;
		case "subtract":
			calculator.differenceOfNumbers();
			break;
		case "multiply":
			calculator.productOFNumbers();
			break;
		case "divide":
			calculator.divisionOfNumbers();
			break;
		}

	}

}
