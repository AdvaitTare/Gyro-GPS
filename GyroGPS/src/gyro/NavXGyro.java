package gyro;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.SPI;

/**
 * Class that represents the NavX MXP navigation sensor.
 * @author Owner
 *
 */
public class NavXGyro{  
    // Abstracted methods for Nav X Gyro
    private static AHRS ahrs;
  
    private NavXGyro() {
    	
    	try { 
    		ahrs = new AHRS (SPI.Port.kMXP); 
    	} 
    	catch (RuntimeException ex ) {
    		DriverStation.reportError("Error instantiating navX MXP:  " + ex.getMessage(), true);
    	}  	
    }
    
    private static final NavXGyro instance = new NavXGyro();

    public NavXGyro getInstance(){
    	return instance;
    }
    
    public void reset() {
    	ahrs.reset();
    }
    
    public double getAngle() {
    	return ahrs.getAngle();
    }
    
    public double getHeading() {
    	return ahrs.getCompassHeading();
    }
}
