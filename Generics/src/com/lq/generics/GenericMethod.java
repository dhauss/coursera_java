package com.lq.generics;

public class GenericMethod {
	
	public static <T> void printArray(T[] inputArr) {
		for(T t: inputArr) {
			System.out.printf("%s", t);
		}
		System.out.println();
		
	}

}
