
package org.usfirst.frc.team3773.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	Talon LD1 = new Talon(0); //Create Drive Controllers
	Talon RD1 = new Talon(1); //Create Drive Controllers
	Jaguar A1 = new Jaguar(2); //Create Arm Controllers
	Joystick DJ = new Joystick(1); //Create Drive Stick
	Joystick AJ = new Joystick(2); //Create Arm Stick
	RobotDrive Drive = new RobotDrive(LD1, RD1); //Create Robot Drive	
	/**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {

    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	Drive.arcadeDrive(DJ); //Drive with one stick	 	
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
