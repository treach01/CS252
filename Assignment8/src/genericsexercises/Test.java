package genericsexercises;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubArray = {1.1,2.2,3.3,4.4};
		Character[] charArray = {'H','E','L','L','O'};
		displayArray(intArray);
		displayArray(doubArray);
		displayArray(charArray);
		
	}
	
	public static <T> void displayArray(T[] elements){
		for(T w:elements) {
			System.out.println(w);
		}
		
	}
}
