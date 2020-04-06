package vendingmachine;


public class Buyer {
	private String name;
	private int money;
	
	
	public Buyer() {
		
	}
	
	public Buyer(String n, int money) {
		this.money = money;
		this.name = n;
	}
	
	public void insertMoney(int m, CoinSlot c, VendingMachine v) {
		c.moneyInsert(m, v);
	}
	public void pushButton(Button b)  {
		b.dispense();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	

}
