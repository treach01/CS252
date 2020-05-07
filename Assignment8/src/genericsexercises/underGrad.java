package genericsexercises;

public class underGrad implements StudentInt<String, Integer> {
	String s;
	Integer i;
	public underGrad(String s, Integer i) {
		this.i = i;
		this.s = s;
	}
	
	@Override
	public void displayStd(String i, Integer s) {
		System.out.println(i);
		System.out.println(s);
	}

}
