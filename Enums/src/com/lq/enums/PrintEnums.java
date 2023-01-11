package com.lq.enums;
import static java.lang.System.out;

public class PrintEnums {

	public static void main(String[] args) {
		for(TirePressures tp: TirePressures.values()) {
			out.printf("%s is %d pounds\n", tp.getName(), tp.getPressure());
		}
		
		TirePressures leftRear = TirePressures.valueOf("LR");
		leftRear.overridePressure(0);
		
		out.println();
		for(TirePressures tp: TirePressures.values()) {
			out.printf("%s is %d pounds\n", tp.getName(), tp.getPressure());
		}
	}

}
