package vendingmachine;


public interface CoinSlot {
	public default void moneyInsert(int money, VendingMachine v) {
		v.inputmoney += money;
	}
	
}
