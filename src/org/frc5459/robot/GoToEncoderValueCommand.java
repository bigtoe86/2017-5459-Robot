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
		
		if(targetDistance != distance){
			
		}
		
		
		return false;//needs if else
	}
}
