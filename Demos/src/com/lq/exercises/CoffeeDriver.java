package com.lq.exercises;
import static java.lang.System.out;

public class CoffeeDriver {

	public static void main(String[] args) {
		Coffee joe = null;
		
		try {
			joe = new Coffee(1100);
			out.printf("Joe's cup: %d\n", joe.getTemperature());
		} catch (TooHotException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		

}
