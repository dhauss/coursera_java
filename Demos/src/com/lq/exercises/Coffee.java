package com.lq.exercises;

public class Coffee {

	public Coffee() throws TooHotException{
		setTemperature(ROOM_TEMP);
	}
	
	public Coffee(int temp) throws TooHotException{
		setTemperature(temp);
	}
	
	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) throws TooHotException {

		if(temperature > 120) {
			throw new TooHotException("Too hot!");
		}
		else {
			this.temperature = temperature;
		}
	}
	
	private int temperature;
	private final int ROOM_TEMP = 68;

}
