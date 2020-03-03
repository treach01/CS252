package problem2;

public class Academic extends Book {
	
	//constructor
	public Academic(int p, int c, String a) {
		super.price = p;
		super.copies = c;
		super.Author =a;
	}
	
	
	@Override
	public int pricepercopy() {
		return price;
	}
	
	@Override
	public String toString() {
		String ret = "Total copies:" + copies;
		return ret;}
}
