package vendingmachine;

public class ReturnTray {
	public String dispensed(Button b) {
		return b.getBeverage();
	}

}