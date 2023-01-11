package com.lq.enums;

public enum TirePressures {
	LF(30, "Left Front"), RF(30, "Right Front"), LR(32, "Left Back"), RR(32, "Left Back");
	
	private TirePressures(int pressure, String name) {
		this.pressure = pressure;
		this.name = name;		
	}
	
	public void overridePressure(int pressure) {
		this.pressure = pressure;
	}
	
	public int getPressure() {
		return pressure;
	}
	
	public String getName() {
		return name;
	}


	int pressure;
	private String name;
}
