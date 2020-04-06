package vendingmachine;

public class Button extends VendingMachine{
	private String beverage;
	private double price;
	
	public String getBeverage() {
		return beverage;
	}

	public void setBeverage(String beverage) {
		this.beverage = beverage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public Button() {
		
	}
	
	public Button(double price, String b) {
		this.beverage = b;
		this.price = price;
	}
	
	public Button(String bname, double p) {
		this.beverage = bname;
		this.price = p;
	}
	
	public void addStock(String aname, int amt) {
		stock += amt;
	}
	
	public void dispense() {
		if (this.CheckStock()) {
			if(inputmoney >= price) {
				super.getR().dispensed(this);
				stock -= 1;
			}
			else {System.out.println("Insufficient Funds");}
			
		}
		System.out.println("Out of stock");
	}

	

}
