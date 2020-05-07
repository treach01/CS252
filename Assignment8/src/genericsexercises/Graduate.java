package genericsexercises;

public class Graduate<T, U> extends Student<T, U> {

	public Graduate(T i, U m) {
		super(i, m);
		System.out.println(i);
		System.out.println(m);
	}

}
