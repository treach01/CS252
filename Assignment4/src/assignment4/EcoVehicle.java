package assignment4;

public class EcoVehicle extends Vehicle{
	public EcoVehicle(String m, int y, String b, int mpg)
	{	super();
		super.model = m;
		super.year = y;
		super.brand = b;
		super.mpg = mpg;}
	
	@Override
	public int fuelEconomy()
	{return super.mpg + 10;}

}
