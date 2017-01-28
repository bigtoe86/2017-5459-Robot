/* Created Sat Jan 14 09:56:00 EST 2017 */
package org.frc5459.robot;

import org.strongback.Strongback;
import org.strongback.SwitchReactor;
import org.strongback.components.Gyroscope;
import org.strongback.components.Motor;
import org.strongback.components.Solenoid;
import org.strongback.components.Solenoid.Direction;
import org.strongback.components.ui.FlightStick;
import org.strongback.hardware.Hardware;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.SPI;

public class Robot extends IterativeRobot {
	private FlightStick operator;
	private Solenoid bucket;
	private SwitchReactor reactor;
	private Motor topRight;
	private Motor middleRight;
	private Motor backRight;
	private Motor topLeft;
	private Motor middleLeft;
	private Motor backLeft;
	private Gyroscope gyro;
//	private CANTalon slave0_MC;
//	private CANTalon slave1_MC;
//	private CANTalon slave2_MC;
//	private CANTalon slave3_MC;
//	private CANTalon slave4_MC;
//	private CANTalon slave5_MC;
	private Encoder encoderRightMaster;
	private Encoder encoderLeftMaster;
	


    @Override
    public void robotInit() {
    	//User Interfaces
    	operator = Hardware.HumanInterfaceDevices.logitechAttack3D(0);
    	reactor = Strongback.switchReactor();
    	
    	//Manipulator 
    	bucket = Hardware.Solenoids.doubleSolenoid(0, 1, Direction.EXTENDING);
    	
    	//Motors and Controllers
//    	topRight = Hardware.Motors.talonSRX(0);
//    	middleRight = Hardware.Motors.talonSRX(1);
//    	backRight = Hardware.Motors.talonSRX(2);
//    	topLeft = Hardware.Motors.talonSRX(3);
//    	middleLeft = Hardware.Motors.talonSRX(4);
//    	backLeft = Hardware.Motors.talonSRX(5);
//    	topRight.invert();
//    	topLeft.invert();
//    	slave0_MC = Hardware.Controllers.talonController(0, pulsesPerDegree, analogTurnsOverVoltageRange);
//    	slave1_MC = Hardware.Controllers.talonController(1, pulsesPerDegree, analogTurnsOverVoltageRange);
//    	slave2_MC = Hardware.Controllers.talonController(2, pulsesPerDegree, analogTurnsOverVoltageRange);
//    	slave3_MC = Hardware.Controllers.talonController(3, pulsesPerDegree, analogTurnsOverVoltageRange);
//    	slave4_MC = Hardware.Controllers.talonController(4, pulsesPerDegree, analogTurnsOverVoltageRange);
//    	slave5_MC = Hardware.Controllers.talonController(5, pulsesPerDegree, analogTurnsOverVoltageRange);
//    	slave0_MC.set(0);
    	
    	encoderRightMaster = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
    	encoderLeftMaster = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
    	
    	//Sensors
    	gyro = Hardware.AngleSensors.gyroscope(SPI.Port.kOnboardCS0);
    	
  
    }   
    
//    public void setSlaves(){
//    	slave0_MC.changeControlMode(CANTalon.TalonControlMode.Follower);
//    	slave1_MC.changeControlMode(CANTalon.TalonControlMode.Follower);
//    	slave2_MC.changeControlMode(CANTalon.TalonControlMode.Follower);
//    	slave3_MC.changeControlMode(CANTalon.TalonControlMode.Follower);
//    	slave4_MC.changeControlMode(CANTalon.TalonControlMode.Follower);
//    	slave5_MC.changeControlMode(CANTalon.TalonControlMode.Follower);
//    
//    }
    
    // Device ID for Motor should equal the Master
//    public static final int RIGHT_SIDE_DRIVE_MASTER_2 = 2;
//    public static CANTalon RightMaster = new CANTalon(RIGHT_SIDE_DRIVE_MASTER_2);
//    
//    public static final int LEFT_SIDE_DRIVE_MASTER_3 = 5;
//    public static CANTalon leftMaster = new CANTalon(LEFT_SIDE_DRIVE_MASTER_3);

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
