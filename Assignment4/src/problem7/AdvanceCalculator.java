package problem7;

public class AdvanceCalculator extends OrdinaryCalculator {
	public double Power(int x, int y) {
		return Math.pow(x, y);
	}
	public double Sqrt(int x) {
		return Math.sqrt(x);
	}
	
	static void Display() {
		System.out.println("I am coloured display");
	}
}
