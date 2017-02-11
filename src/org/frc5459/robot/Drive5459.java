package org.frc5459.robot;

import org.strongback.components.Solenoid;
import org.strongback.components.TalonSRX.StatusFrameRate;
import org.strongback.control.TalonController;
import org.strongback.control.TalonController.ControlMode;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Ultrasonic;

public class Drive5459 {
	private TalonController rightController;
	private TalonController leftController;
	private Ultrasonic ultraX;
	private Ultrasonic ultraY;
	private Encoder leftEncoder;
	private Encoder rightEncoder;
	private ADIS16448_IMU imu;
	private Solenoid gearShift;
	
	
	static enum currentGear{
		HIGHGEAR,
		LOWGEAR,
	}
	
	public Drive5459(TalonController right, TalonController left, Ultrasonic ultraX, Ultrasonic ultraY, Encoder leftEncoder, Encoder rightEncoder,
			ADIS16448_IMU imu, Solenoid gearShift){
		this.ultraX = ultraX;
		this.ultraY = ultraY;
		this.leftEncoder = leftEncoder;
		this.rightEncoder = rightEncoder;
		this.imu = imu;
		this.gearShift = gearShift;
		this.rightController = right;
		this.leftController = left;
	}
	
	public void setPowerRight(double power){
		rightController.setControlMode(ControlMode.SPEED);
		rightController.setSpeed(power);
	}
	
	public void setPowerLeft(double power){
		leftController.setControlMode(ControlMode.SPEED);
		leftController.setSpeed(power);
	}
	
	public void setEncoderTargetAngleRight(double targetAngle){
		rightController.setStatusFrameRate(StatusFrameRate.FEEDBACK, 20);
		rightController.setControlMode(ControlMode.POSITION);
		rightController.withTarget(targetAngle);
	}
	
	public void setEncoderTargetAngleLeft(double targetAngle){
		leftController.setStatusFrameRate(StatusFrameRate.FEEDBACK, 20);
		leftController.setControlMode(ControlMode.POSITION);
		leftController.withTarget(targetAngle);
	}
	
	public double getUltrasonicX(){
		return ultraX.getRangeInches();
	}
	
	public double getUltrasonicY(){
		return ultraY.getRangeInches();
	}
	
	public double gyroAngle(){
		return imu.getAngleZ() * 180/Math.PI;
		//this will most likely need to be changed
	}
	
	public int rightEncdoerCount(){
		return rightEncoder.get();
	}
	
	public int leftEncoderCount(){
		return leftEncoder.get();
	}
	
	public void extend(){
		gearShift.extend();
	}
	
	public void retract(){
		gearShift.retract();
	}
	
	//TODO write get acceration methods
	
	
	
	
	
		
	
	
	

}
