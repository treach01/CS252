package vendingmachine;


public abstract class VendingMachine {
	protected int stock;
	protected double inputmoney;
	private static int astock;
	private Button a;
	private Button b;
	private Button c;
	private ReturnTray r;
	private CoinSlot d;
	
	public VendingMachine() {
		
	}
	
	public VendingMachine(Button a, Button b, Button c, ReturnTray r, CoinSlot d) {
		this.a =a ;
		this.b = b;
		this.c = c;
		this.r = r;
		this.d = d;
	}
	
	public void addStock(String bname) {
		astock += 1;
	}
	
	public boolean CheckStock() {
		return stock > 0;
	}
	
	public void addmoney(double money) {
		inputmoney += money;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getInputmoney() {
		return inputmoney;
	}

	public void setInputmoney(double inputmoney) {
		this.inputmoney = inputmoney;
	}

	public static int getAstock() {
		return astock;
	}

	public static void setAstock(int astock) {
		VendingMachine.astock = astock;
	}

	public Button getA() {
		return a;
	}

	public void setA(Button a) {
		this.a = a;
	}

	public Button getB() {
		return b;
	}

	public void setB(Button b) {
		this.b = b;
	}

	public Button getC() {
		return c;
	}

	public void setC(Button c) {
		this.c = c;
	}

	public ReturnTray getR() {
		return r;
	}

	public void setR(ReturnTray r) {
		this.r = r;
	}

	public CoinSlot getD() {
		return d;
	}

	public void setD(CoinSlot d) {
		this.d = d;
	}

}
