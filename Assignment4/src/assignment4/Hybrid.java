package assignment4;

public class Hybrid extends Vehicle{
	
	public Hybrid(String m, int y, String b, int mpg)
	{	super();
		super.model = m;
		super.year = y;
		super.brand = b;
		super.mpg = mpg;}
	
	@Override
	public int fuelEconomy()
	{return super.mpg +50;}
	
}
