package org.frc5459.robot;

import org.strongback.components.Gyroscope;
import org.strongback.components.Motor;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Ultrasonic;

public class Drive5459 {
	private Motor Right;
	private Motor Left;
	private Ultrasonic ultraX;
	private Ultrasonic ultraY;
	private Encoder leftEncoder;
	private Encoder rightEncoder;
	private Gyroscope gyro;
	
	
	static enum currentGear{
		HIGHGEAR,
		LOWGEAR,
	}
	
	public Drive5459(Motor Right, Motor Left, Ultrasonic ultraX, Ultrasonic ultraY, Encoder leftEncoder, Encoder rightEncoder, Gyroscope gyro){
		this.Left = Left;
		this.Right = Right;
		this.ultraX = ultraX;
		this.ultraY = ultraY;
		this.leftEncoder = leftEncoder;
		this.rightEncoder = rightEncoder;
		this.gyro = gyro;
	}
	
	public void setPowerRight(double power){
		//Right.setSpeed(power);
	}
	
	public void setPowerLeft(double power){
		//Left.setSpeed(power);
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
	
	
	
	
		
	
	
	

}
