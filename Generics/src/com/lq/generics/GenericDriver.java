package com.lq.generics;
import static java.lang.System.out;

public class GenericDriver {

	public static void main(String[] args) {
		GenericBox<Integer> intBox = new GenericBox<>();
		GenericBox<String > sBox = new GenericBox<>();
		Integer[] IntArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		Double[] DubArr = {0.5, 1.5, 2.5, 3.5, 4.5};
		Character[] CharArr = {'S', 'U', 'P'};
		
		
		intBox.setT(10);
		sBox.setT("Hello, World");
		
		out.printf("Int: %d, String: %s\n", intBox.getT(), sBox.getT());
		
		GenericMethod.printArray(IntArr);
		GenericMethod.printArray(DubArr);
		GenericMethod.printArray(CharArr);
		
		out.printf("Max of %d, %d, and %d is %d\n", 4, 5, 6, Maximum.maximum(4,  5, 6));
		out.printf("Max of %.2f, %.2f, and %.2f is %.2f\n", 18.34, 34.56, 987.34, Maximum.maximum(18.34, 34.56, 987.34));
		out.printf("Max of pear, apple, and orange is %s\n", Maximum.maximum("pear", "apple", "orange"));

	}

}
