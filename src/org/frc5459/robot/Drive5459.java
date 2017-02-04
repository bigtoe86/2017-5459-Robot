package org.frc5459.robot;

import org.strongback.components.Gyroscope;
import org.strongback.components.Solenoid;
import org.strongback.components.TalonSRX.FeedbackDevice;
import org.strongback.control.TalonController;
import org.strongback.control.TalonController.ControlMode;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Drive5459 {
	private TalonController right;
	private TalonController left;
	private Ultrasonic ultraX;
	private Ultrasonic ultraY;
	private Encoder leftEncoder;
	private Encoder rightEncoder;
	private Gyroscope gyro;
	private Solenoid gearShift;
	
	
	static enum currentGear{
		HIGHGEAR,
		LOWGEAR,
	}
	
	public Drive5459(TalonController right, TalonController left, Ultrasonic ultraX, Ultrasonic ultraY, Encoder leftEncoder, Encoder rightEncoder,
			Gyroscope gyro, Solenoid gearShift){
		this.left = left;
		this.right = right;
		this.ultraX = ultraX;
		this.ultraY = ultraY;
		this.leftEncoder = leftEncoder;
		this.rightEncoder = rightEncoder;
		this.gyro = gyro;
		this.gearShift = gearShift;
	}
	
	public void setSpeedRight(double power){
		right.setControlMode(ControlMode.SPEED);
		right.setSpeed(power);
	}
	
	public void setSpeedLeft(double power){
		left.setControlMode(ControlMode.SPEED);
		left.setSpeed(power);
	}
	
	public void setEncoderRight(){
		right.setFeedbackDevice(FeedbackDevice.MAGNETIC_ENCODER_RELATIVE);
		right.setControlMode(ControlMode.POSITION);
	}
	
	public void setEncoderLeft(){
		left.setFeedbackDevice(FeedbackDevice.MAGNETIC_ENCODER_RELATIVE);
		left.setControlMode(ControlMode.POSITION);
	}
	
	public double getUltrasonicX(){
		return ultraX.getRangeInches();
	}
	
	public double getUltrasonicY(){
		return ultraY.getRangeInches();
	}
	
	public double gyroAngle(){
		return gyro.getAngle() * 180/Math.PI;
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
	
	
	
	
	
		
	
	
	

}
