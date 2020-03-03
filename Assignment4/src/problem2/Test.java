package problem2;

public class Test {
	public static void main(String[] args) {
		ScientificTransaction sci = new ScientificTransaction(12, 200, 1400, "Great Science");
		Academic acad = new Academic(12, 300, "Rumsefeld");
		System.out.println(acad.toString());
		System.out.println(sci.toString());
		System.out.println(acad.pricepercopy());
		System.out.println(sci.pricepercopy());
	}
}
