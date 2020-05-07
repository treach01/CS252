package genericsexercises;

public class Undergrad extends Student<String, Integer> {

	public Undergrad(String i, Integer m) {
		super(i, m);
		System.out.println(i);
		System.out.println(m);
	}
	
}
