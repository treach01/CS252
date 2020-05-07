package assignment9;

import java.util.function.BiFunction;

public class Calclambda {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> add = (Integer arg0, Integer arg1) -> 
				arg0 + arg1;
		BiFunction<Integer, Integer, Integer> subtract = (Integer arg0, Integer arg1) -> 
				arg0 - arg1;
		BiFunction<Integer, Integer, Integer> multiply = (Integer arg0, Integer arg1) -> 
				arg0 * arg1;
		BiFunction<Integer, Integer, Float> divide = (Integer arg0, Integer arg1) -> 
				(float) arg0 / arg1;
	System.out.println(add.apply(8, 4));
	System.out.println(subtract.apply(8, 4));
	System.out.println(multiply.apply(8, 4));
	System.out.println(divide.apply(8, 4));

	}

}
