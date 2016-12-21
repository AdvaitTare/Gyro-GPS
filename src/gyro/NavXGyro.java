package com.team503.lib.util;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.SPI;

public class NavXGyro{  
    // Abstracted methods for Nav X Gyro
    public static AHRS ahrs;
  

    private NavXGyro() {
    	
    	try { 
    		ahrs = new AHRS (SPI.Port.kMXP); 
    	} 
    	catch (RuntimeException ex ) {
    		DriverStation.reportError("Error instantiating navX MXP:  " + ex.getMessage(), true);
    	}  	
    }
    public void gyroReset() {
    	ahrs.reset();
    }
    public double getAngle() {
    	return ahrs.getAngle();
    }
    public double getHeading() {
    	return ahrs.getCompassHeading();
    }
}

