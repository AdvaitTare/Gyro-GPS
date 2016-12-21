package com.team503.lib.util;

import edu.wpi.first.wpilibj.AnalogInput;
/*=============================================================
 * +--------------------+--------------+
 * | LVMaxSonarEZ4.java | FRC Team 503 |
 * +--------------------+--------------+
 * 
 * This is the code for the ultrasonic sensors
 *=============================================================*/
public class LVMaxSonarEZ4 {
	private final double VOLTS_PER_INCH = 0.009766;
	private AnalogInput analogSensor;
	
	public LVMaxSonarEZ4(int port) {
		analogSensor = new AnalogInput(port);
	}
	
	//This next method has not been tested yet
	public double getDistance() {
		return analogSensor.getVoltage()/VOLTS_PER_INCH;
	}
	
}
