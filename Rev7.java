
package org.usfirst.frc.team3773.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Encoder;
/**
* The VM is configured to automatically run this class, and to call the
* functions corresponding to each mode, as described in the IterativeRobot
* documentation. If you change the name of this class or the package after
* creating this project, you must also update the manifest file in the resource
* directory.
*/
public class Robot extends IterativeRobot {
	Talon LD1 = new Talon(1); //Create Drive Controllers
	Talon RD1 = new Talon(1); //Create Drive Controllers
	Talon A1 = new Talon(2); //Create Arm Controllers
	Joystick DJ = new Joystick(1); //Create Drive Stick
	Joystick AJ = new Joystick(0); //Create Arm Stick
	RobotDrive Drive = new RobotDrive(LD1, RD1); //Create Robot Drive
	Timer t = new Timer(); //Create Timer for Autonomous Code
	Encoder AE1 = new Encoder(0, 1);
	double ti=0;
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
	t.start(); //Start the Timer Running
	while (ti < 2) { //Make a Loop to Run the Autonomous Code
		Drive.drive(-.5, 0); //Drive Forward at Half Speed Until the Timer Reaches Two
		ti = t.get();
	}
	while (ti < 3) {
		Drive.drive(0, .5);
	}
	t.stop();
}
/**
* This function is called periodically during operator control
*/
public void teleopPeriodic() {
	double AY = AJ.getY(); //Get Y Axis for Arm Joystick
	double DY = DJ.getY(); //Get Y Axis for Drive Joystick
	double DX = DJ.getX(); //Get X Axis for Drive Joystick
	double E1 = AE1.get();
	Drive.arcadeDrive(DY, -DX); //Drive with one stick
	A1.set(AY); //Set Arm Motor with Arm Joystick
}
/**
* This function is called periodically during test mode
*/
public void testPeriodic() {

}
}
