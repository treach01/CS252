package problem3;

public class SavingAccount extends Account {
	@Override
	public double CalculateProfit( ) {
		return super.amnt * .10;
	}

}
