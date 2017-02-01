package org.frc5459.robot;

import org.strongback.command.Command;
import org.strongback.components.Motor;

public class StopClimbCommand extends Command{
	private Motor ClimberMotor;
	
	public StopClimbCommand(Motor ClimberMotor){
		this.ClimberMotor =ClimberMotor;
	}

	@Override
	public boolean execute(){
		ClimberMotor.stop();;
		return true;
	}
}

