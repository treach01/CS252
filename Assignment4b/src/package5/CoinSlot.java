package package5;

public interface CoinSlot {
	public default void moneyInsert(int money, VendingMachine v) {
		v.inputmoney += money;
	}
	
}
