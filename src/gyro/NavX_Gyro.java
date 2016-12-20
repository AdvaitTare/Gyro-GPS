package gyro;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI;

public class NavX_Gyro 
{
	AHRS ahrs;
	public NavX_Gyro()
	{
		try
		{
			ahrs = new AHRS(SPI.Port.kMXP);
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void reset()
	{
		ahrs.reset();
	}
	public double getAngle()
	{
		return ahrs.getAngle();
	}
	
}
