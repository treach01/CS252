package assignment4;

public class Vehicle {
	protected String model;
	protected int year;
	protected String brand;
	protected String color;
	protected int mpg;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String m, int y, String b, int mpg)
	{	this.model = m;
		this.year = y;
		this.brand = b;
		this.mpg = mpg;}
	
	public Vehicle(String m, String b, int y, String color, int mpg )
	{	this.brand= b;
		this.color=color;
		this.year=y;
		this.model=m;
		this.mpg=mpg;
	}
	
	public int fuelEconomy() {
		return mpg;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMpg() {
		return mpg;
	}

	public void setMpg(int mpg) {
		this.mpg = mpg;
	}

}
