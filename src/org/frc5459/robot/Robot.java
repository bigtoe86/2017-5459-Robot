/* Created Sat Jan 14 09:56:00 EST 2017 */
package org.frc5459.robot;

import org.strongback.Strongback;
import org.strongback.SwitchReactor;
import org.strongback.components.Gyroscope;
import org.strongback.components.Solenoid;
import org.strongback.components.Solenoid.Direction;
import org.strongback.components.TalonSRX.FeedbackDevice;
import org.strongback.components.TalonSRX;
import org.strongback.components.ui.FlightStick;
import org.strongback.control.TalonController;
import org.strongback.control.TalonController.ControlMode;
import org.strongback.hardware.Hardware;

import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Robot extends IterativeRobot {
	private FlightStick operator;
	private Solenoid bucket;
	private SwitchReactor reactor;
	private TalonController topRight;
	private TalonController middleRight;
	private TalonController bottomRight;
	private TalonController climber;
	private TalonController topLeft;
	private TalonController middleLeft;
	private TalonController bottomLeft;
	private ADIS16448_IMU imu;
	String[] bucketPosition = new String[2];


	


    @Override
    public void robotInit() {
    	//User Interfaces
    	operator = Hardware.HumanInterfaceDevices.logitechAttack3D(0);
    	reactor = Strongback.switchReactor();
    	
    	//Manipulator 
    	bucket = Hardware.Solenoids.doubleSolenoid(0, 1, Direction.EXTENDING);
    	//11.37
    	//Motors and Controllers
    	topRight = Hardware.Controllers.talonController(1, 11.37, 0); //TalonSRX #1
    	middleRight = Hardware.Controllers.talonController(2, 11.37, 0); //TalonSRX #2
    	bottomRight = Hardware.Controllers.talonController(3, 11.37, 0); //TalonSRX #3
    	climber = Hardware.Controllers.talonController(4, 11.37, 0); //TalonSRX #4
    	topLeft = Hardware.Controllers.talonController(5, 11.37, 0); //TalonSRX #5
    	middleLeft = Hardware.Controllers.talonController(6, 11.37,0); //TalonSRX #6
    	bottomRight = Hardware.Controllers.talonController(7, 11.37,0); //TalonSRX #7
    	//Setting Followers
    	//topRight is Right Side Master (TalonSRX #1)
    	topRight.withGains(0.1, 0.001, 0.0);
    	topRight.setFeedbackDevice(FeedbackDevice.MAGNETIC_ENCODER_ABSOLUTE);
    	middleRight.setControlMode(ControlMode.FOLLOWER);//TalonSRX #2
    	middleRight.withTarget(topRight.getDeviceID());
    	bottomRight.setControlMode(ControlMode.FOLLOWER); //TalonSRX #3
    	bottomRight.withTarget(topRight.getDeviceID());
    	//climber is the climber Motor (TalonSRX #4)
    	//TopLeft is Right Side Master (TalonSRX #5)
    	topLeft.withGains(0.1, 0.001, 0.0);
    	topLeft.setFeedbackDevice(FeedbackDevice.MAGNETIC_ENCODER_ABSOLUTE);
    	middleLeft.setControlMode(ControlMode.FOLLOWER); //TalonSRX #6
    	middleLeft.withTarget(topLeft.getDeviceID());
    	bottomLeft.setControlMode(ControlMode.FOLLOWER); //TalonSRX #7
    	bottomLeft.withTarget(topLeft.getDeviceID());
    	//Sensors
    	imu = new ADIS16448_IMU();
    	
  
    }   
    
    
    @Override
    public void teleopInit() {
        // Start Strongback functions ...
        Strongback.start();
    }

    @Override
    public void teleopPeriodic() {
    	reactor.onTriggered(operator.getButton(5), () -> Strongback.submit(new BucketExtendCommand(bucket)));
    	reactor.onTriggered(operator.getButton(3), () -> Strongback.submit(new BucketRetractCommand(bucket)));
    	
    	
    	
    	
    }

    @Override
    public void disabledInit() {
        // Tell Strongback that the robot is disabled so it can flush and kill commands.
        Strongback.disable();
    }

}

