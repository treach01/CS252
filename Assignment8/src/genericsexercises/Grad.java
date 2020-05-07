package genericsexercises;

public class Grad<T, U> implements StudentInt<T, U> {

	@Override
	public void displayStd(T i, U x) {
		System.out.println(i);
		System.out.println(x);
		
	}
		
}
