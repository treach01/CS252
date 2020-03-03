package problem7;

public class OrdinaryCalculator implements Calculator {

	@Override
	public int addition(int x, int y) {
		return x + y;
	}

	@Override
	public int multiplication(int x, int y) {
		return x * y;
	}

	@Override
	public int subtraction(int x, int y) {
		return x - y;
	}

	@Override
	public int division(int x, int y) {
		return x / y;
	}
	
	static void Display() {
		System.out.println("I am B&W display");
	}

}
