package assignment9;

import java.util.function.BiFunction;;

public class Calculator {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> add = new BiFunction<Integer, Integer, Integer>() {

				@Override
				public Integer apply(Integer arg0, Integer arg1) {
					return arg0 + arg1;
				}};
		BiFunction<Integer, Integer, Integer> subtract = new BiFunction<Integer, Integer, Integer>() {

				@Override
				public Integer apply(Integer arg0, Integer arg1) {
					return arg0 - arg1;
				}};
		BiFunction<Integer, Integer, Integer> multiply = new BiFunction<Integer, Integer, Integer>() {

				@Override
				public Integer apply(Integer arg0, Integer arg1) {
					return arg0 * arg1;
					}};
		BiFunction<Integer, Integer, Float> divide = new BiFunction<Integer, Integer, Float>() {
				@Override
				public Float apply(Integer arg0, Integer arg1) {
					return (float) (arg0 / arg1);
					}};
		System.out.println(add.apply(8, 4));
		System.out.println(subtract.apply(8, 4));
		System.out.println(multiply.apply(8, 4));
		System.out.println(divide.apply(8, 4));
}

}