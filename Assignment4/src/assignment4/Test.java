package assignment4;

public final class Test {
	public static void main(String[] args) {
		Hybrid prius = new Hybrid("Prius", 2015, "Toyota", 30);
		EcoVehicle civic = new EcoVehicle("Civic", 2012, "Honda", 20);
		Vehicle tacoma = new Vehicle("Tacoma", 2009, "Toyota", 10);
		Vehicle[] arr = {prius, civic, tacoma};
		for(Vehicle s:arr) 
		{
			System.out.println(s.model + s.fuelEconomy());
		}
	}
}
