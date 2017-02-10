package org.frc5459.robot;

import org.strongback.command.Command;

public class GoToEncoderValueCommand extends Command {

	Drive5459 drive;
	double targetDistance;
	double distance;
	double encoderGlobalVariable;
	
	public GoToEncoderValueCommand(){
		this.targetDistance = 0;
		this.drive = null;
	}
	public GoToEncoderValueCommand(double targetDistance){
		this.targetDistance = targetDistance;
		this.drive = drive;
	}
	public boolean execute(){
		encoderGlobalVariable = targetDistance;
		distance = Drive5459.getEncoderValue();
		
		if(targetDistance != distance){
			drive.setPowerRight(1.0);
			drive.setPowerLeft(1.0);
		}else{
			
		}
		
		if(targetDistance == distance){
			return true;
		}else{
			return false;
		}
		//needs if else
	}
}
